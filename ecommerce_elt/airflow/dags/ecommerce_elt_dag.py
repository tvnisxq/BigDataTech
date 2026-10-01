from datetime import datetime

from airflow import DAG
from airflow.providers.standard.operators.bash import BashOperator

BASE = "/home/tvnisxq/ecommerce-elt"
BEELINE = "beeline -u jdbc:hive2://localhost:10000 -n tvnisxq"

default_args = {
    "owner": "data-engineering",
    "depends_on_past": False,
}

with DAG(
    dag_id="ecommerce_elt_pipeline",
    default_args=default_args,
    start_date=datetime(2026, 1, 1),
    schedule=None,
    catchup=False,
    tags=["ecommerce", "elt", "hive"],
) as dag:

    load_orders_hdfs = BashOperator(
        task_id="load_orders_hdfs",
        bash_command=f"hdfs dfs -mkdir -p /data/raw/orders && hdfs dfs -put -f {BASE}/input/orders.csv /data/raw/orders/ ",
    )

    sqoop_customers = BashOperator(
        task_id="sqoop_customers",
        bash_command=f"bash {BASE}/scripts/sqoop_customers.sh ",
    )

    create_raw_tables = BashOperator(
        task_id="create_raw_tables",
        bash_command=f"{BEELINE} -f {BASE}/sql/01_create_raw_tables.sql ",
    )

    transform_orders = BashOperator(
        task_id="transform_orders",
        bash_command=f"{BEELINE} -f {BASE}/sql/02_transform.sql ",
    )

    customer_summary = BashOperator(
        task_id="customer_summary",
        bash_command=f"{BEELINE} -f {BASE}/sql/03_customer_summary.sql ",
    )

    daily_sales = BashOperator(
        task_id="daily_sales",
        bash_command=f"{BEELINE} -f {BASE}/sql/04_daily_sales.sql ",
    )

    top_customers = BashOperator(
        task_id="top_customers",
        bash_command=f"{BEELINE} -f {BASE}/sql/05_top_customers.sql ",
    )

    load_orders_hdfs >> sqoop_customers >> create_raw_tables >> transform_orders
    transform_orders >> [customer_summary, daily_sales]
    customer_summary >> top_customers
