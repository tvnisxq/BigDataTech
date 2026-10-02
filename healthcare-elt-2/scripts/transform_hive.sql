USE healthcare_elt_2;

SET hive.auto.convert.join=false;

ADD JAR /usr/lib/hive/lib/hive-hcatalog-core-4.0.1.jar;

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
GROUP BY
    p.patient_id,
    p.patient_name,
    p.city;
