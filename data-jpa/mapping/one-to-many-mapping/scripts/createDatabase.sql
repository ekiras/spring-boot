create database jpa_mapping;

INSERT INTO department(date_created,last_updated,name) VALUES(now(),now(),"ADMIN");
INSERT INTO department(date_created,last_updated,name) VALUES(now(),now(),"IT");
INSERT INTO department(date_created,last_updated,name) VALUES(now(),now(),"SALES");

INSERT INTO employee(date_created,last_updated,email,name,password,department_id) VALUES(now(),now(),"u1@ekiras.com","user1","pwd",1);
INSERT INTO employee(date_created,last_updated,email,name,password,department_id) VALUES(now(),now(),"u2@ekiras.com","user2","pwd",1);
INSERT INTO employee(date_created,last_updated,email,name,password,department_id) VALUES(now(),now(),"u3@ekiras.com","user3","pwd",2);
INSERT INTO employee(date_created,last_updated,email,name,password,department_id) VALUES(now(),now(),"u4@ekiras.com","user4","pwd",3);

INSERT INTO address(date_created,last_updated,employee_id,address) VALUES(now(),now(),1,"some address");
INSERT INTO address(date_created,last_updated,employee_id,address) VALUES(now(),now(),2,"some address");
INSERT INTO address(date_created,last_updated,employee_id,address) VALUES(now(),now(),3,"some address");
INSERT INTO address(date_created,last_updated,employee_id,address) VALUES(now(),now(),4,"some address");