#!/bin/bash

set -euo pipefail

echo "Starting RAW data load..."

echo "Loading JSON visits into HDFS..."

hdfs dfs -mkdir -p /healthcare-elt-2/raw/visits

hdfs dfs -put -f \
    ~/healthcare-elt-2/data/patient_visits.json \
    /healthcare-elt-2/raw/visits/

echo "Importing patients from MySQL..."

hdfs dfs -rm -r -f /healthcare-elt-2/raw/patients

HADOOP_USER_CLASSPATH_FIRST=true \
sqoop import \
    --connect jdbc:mysql://localhost:3306/healthcare \
    --username root \
    --password welcome \
    --table patients \
    --target-dir /healthcare-elt-2/raw/patients \
    --delete-target-dir \
    --m 1

echo "RAW data load completed."
