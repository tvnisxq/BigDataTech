#!/bin/bash

LOG=~/healthcare-elt-2/logs/pipeline_$(date +%Y%m%d).log

echo "========================================" >> "$LOG"
echo "Healthcare ELT Pipeline Started" >> "$LOG"
echo "Start Time: $(date)" >> "$LOG"

echo "STEP 1: Loading RAW data" >> "$LOG"

~/healthcare-elt-2/scripts/load_raw.sh >> "$LOG" 2>&1

if [ $? -ne 0 ]; then
    echo "RAW LOAD FAILED" >> "$LOG"
    exit 1
fi

echo "STEP 2: Hive Transformation" >> "$LOG"

beeline -u jdbc:hive2://localhost:10000/ -n tvnisxq \
    -f ~/healthcare-elt-2/scripts/transform_hive.sql >> "$LOG" 2>&1

if [ $? -ne 0 ]; then
    echo "HIVE TRANSFORMATION FAILED" >> "$LOG"
    exit 1
fi

echo "STEP 3: Pipeline Completed" >> "$LOG"
echo "End Time: $(date)" >> "$LOG"
