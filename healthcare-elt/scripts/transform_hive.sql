USE healthcare_elt;

SET hive.auto.convert.join=false;

DROP TABLE IF EXISTS patient_analytics;

CREATE TABLE patient_analytics (
    patient_id STRING,
    patient_name STRING,
    city STRING,
    total_visits INT,
    total_spent DOUBLE
)
STORED AS PARQUET;

INSERT OVERWRITE TABLE patient_analytics
SELECT
    p.patient_id,
    p.patient_name,
    p.city,
    COUNT(v.visit_id) AS total_visits,
    SUM(v.amount) AS total_spent
FROM patients_raw p
JOIN visits_raw v
ON p.patient_id = v.patient_id
GROUP BY p.patient_id, p.patient_name, p.city;
