create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
(10001, 'ABHILASH', 'BANGALORE', SYSDATE());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
(10002, 'MOHIT', 'DELHI', SYSDATE());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
(10003, 'DAVID', 'NEW YORK', SYSDATE());


--With Jpa the table would be created automatically
/*create table employee
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);*/

INSERT INTO EMPLOYEE (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
(10001, 'EMPLOYEE1', 'BANGALORE', SYSDATE());
INSERT INTO EMPLOYEE (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
(10002, 'EMPLOYEE2', 'DELHI', SYSDATE());
INSERT INTO EMPLOYEE (ID,NAME,LOCATION,BIRTH_DATE)
VALUES
(10003, 'EMPLOYEE3', 'NEW YORK', SYSDATE());