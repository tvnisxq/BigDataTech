#!/bin/bash

BASE="$HOME/healthcare-elt"
LOG=$BASE/logs/pipeline_$(date +%Y%m%d).log

echo "========================================" >> $LOG
echo "Healthcare ELT Pipeline Started" >> $LOG
echo "Start Time: $(date)" >> $LOG

echo "STEP 1: Loading RAW data" >> $LOG
$BASE/scripts/load_raw.sh >> $LOG 2>&1
if [ $? -ne 0 ]; then
    echo "RAW LOAD FAILED" >> $LOG
    exit 1
fi

echo "STEP 2: Hive Transformation" >> $LOG
beeline -u jdbc:hive2://localhost:10000 -n tvnisxq --silent=true -f $BASE/scripts/transform_hive.sql >> $LOG 2>&1
if [ $? -ne 0 ]; then
    echo "HIVE TRANSFORMATION FAILED" >> $LOG
    exit 1
fi

echo "STEP 3: Pipeline Completed" >> $LOG
echo "End Time: $(date)" >> $LOG
