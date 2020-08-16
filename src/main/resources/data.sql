/*
create table person
(id integer not null,
 name varchar(255) not null, 
location varchar(255),
birth_date timestamp, 
primary key(id)
);
*/
Insert into person
 (ID, NAME ,LOCATION , BIRTH_DATE) 
VALUES(101, 'nikhil', 'hyderabad' , sysdate());


Insert into person
 (ID, NAME ,LOCATION , BIRTH_DATE)
VALUES(102, 'Sweety', 'BHEL' , sysdate());

Insert into person
 (ID, NAME ,LOCATION , BIRTH_DATE)
VALUES(103, 'ankur', 'Delhi' , sysdate());

Insert into person
 (ID, NAME ,LOCATION , BIRTH_DATE)
VALUES(104, 'john', 'New York' , sysdate());

Insert into person
 (ID, NAME ,LOCATION , BIRTH_DATE)
VALUES(109, 'rushi', 'himalay' , sysdate());
