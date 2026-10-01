#!/bin/bash
set -eo pipefail

TMP=/tmp/customers.csv

mysql -u etl -pwelcome -N -B -e "SELECT customer_id, name, email FROM ecommerce.customers" \
  | tr '\t' ',' > $TMP

hdfs dfs -rm -r -f /data/raw/customers
hdfs dfs -mkdir -p /data/raw/customers
hdfs dfs -put -f $TMP /data/raw/customers/part-m-00000
