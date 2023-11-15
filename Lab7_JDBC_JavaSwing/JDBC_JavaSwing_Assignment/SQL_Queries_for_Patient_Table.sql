-- create database database1;
show databases;

create database medicaldb;
show databases;

use medicaldb;
show tables;

CREATE TABLE patient(first_name varchar(30),
	last_name varchar(30),
	age int,
    type varchar(25));

show tables;
-- Returns the patient table

SELECT * FROM patient;
-- Currently there is no data present in the table

-- I will insert values into the patient table from the application
