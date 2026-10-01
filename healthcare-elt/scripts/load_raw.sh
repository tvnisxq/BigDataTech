#!/bin/bash
set -eo pipefail

BASE="$HOME/healthcare-elt"
HDFS_RAW=/data/healthcare-elt/raw

echo "Starting RAW data load..."

echo "Loading JSON visits into HDFS..."
hdfs dfs -mkdir -p $HDFS_RAW/visits
hdfs dfs -put -f $BASE/data/patient_visits.json $HDFS_RAW/visits/

echo "Exporting patients from MySQL..."
MYSQL_PWD=elt123 mysql -u elt -N -B -e "SELECT * FROM healthcare.patients;" \
  | tr '\t' ',' > $BASE/data/patients.csv

echo "Loading patients into HDFS..."
hdfs dfs -mkdir -p $HDFS_RAW/patients
hdfs dfs -put -f $BASE/data/patients.csv $HDFS_RAW/patients/

echo "RAW data load completed."
