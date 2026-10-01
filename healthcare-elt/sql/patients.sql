CREATE DATABASE IF NOT EXISTS healthcare;
USE healthcare;
DROP TABLE IF EXISTS patients;
CREATE TABLE patients (
    patient_id VARCHAR(20),
    patient_name VARCHAR(50),
    gender VARCHAR(10),
    age INT,
    city VARCHAR(50)
);
INSERT INTO patients VALUES
('P001','John','Male',45,'Bangalore'),
('P002','Anita','Female',32,'Mysore'),
('P003','Ravi','Male',58,'Bangalore'),
('P004','Priya','Female',40,'Chennai');
