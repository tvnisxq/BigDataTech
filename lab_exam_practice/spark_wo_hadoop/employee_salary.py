from pyspark import SparkConf, SparkContext
conf = SparkConf().setAppName("EmployeeSalaryAnalysis") \
        .setMaster("local[*]") \
        .set("spark.hadoop.fs.defaultFS", "file:///")
sc = SparkContext(conf=conf)

lines = sc.textFile("input/employees.csv")
header = lines.first()
data = lines.filter(lambda x: x != header)

mapped = data.map(lambda x: (x.split(',')[2], (int(x.split(',')[3]),1)))
reduced = mapped.reduceByKey(lambda x,y: (x[0]+y[0], x[1]+y[1]))
result=reduced.mapValues(lambda x: (x[1], x[0], x[0]/x[1])).sortByKey()

for d,v in result.collect():
    print(d, v[0], v[1], v[2])

result.map(lambda x: (x[0], x[1][0], x[1][1], x[1][2])) \
        .map(lambda x: ','.join(map(str,x))) \
        .coalesce(1).saveAsTextFile("output/department_salary")

sc.stop()
