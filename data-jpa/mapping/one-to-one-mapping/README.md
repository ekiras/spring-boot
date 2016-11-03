
[Read Full Description](http://www.ekiras.com/2016/09/one-to-one-mapping-in-spring-boot-spring-data-jpa-hibernate.html)
---


> **Also Read**   
> 1. [One to One Mapping](http://www.ekiras.com/2016/09/one-to-one-mapping-in-spring-boot-spring-data-jpa-hibernate.html)  
> 2. [One to Many Mapping](http://www.ekiras.com/2016/11/one-to-many-mapping-in-spring-boot-spring-data-jpa-hibernate.html)


# One To One Mapping 
Let's take two entitie/domains 

1.  Employee
2.  Address

Where the relation between the two enties is, an Employee can have only one Address and an Address can belong to only one Employee i.e One To One (Employee - Address).

Simplest code to make this mapping can be as follows.

## Employee.java
    @Entity
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        protected long id;

        @OneToOne(mappedBy = "employee",optional = false,cascade = CascadeType.ALL)
        private Address address;

    }

## Address.java
    @Entity
    public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @OneToOne(fetch = FetchType.LAZY)
        private Employee employee;

    }
    
The tables in sql formed will be as follows

    mysql> desc employee;
    +--------------+--------------+------+-----+---------+----------------+
    | Field        | Type         | Null | Key | Default | Extra          |
    +--------------+--------------+------+-----+---------+----------------+
    | id           | bigint(20)   | NO   | PRI | NULL    | auto_increment |
    | date_created | datetime     | YES  |     | NULL    |                |
    | email        | varchar(255) | YES  |     | NULL    |                |
    | last_updated | datetime     | YES  |     | NULL    |                |
    | name         | varchar(255) | YES  |     | NULL    |                |
    | password     | varchar(255) | YES  |     | NULL    |                |
    +--------------+--------------+------+-----+---------+----------------+

    mysql> desc address;
    +--------------+--------------+------+-----+---------+----------------+
    | Field        | Type         | Null | Key | Default | Extra          |
    +--------------+--------------+------+-----+---------+----------------+
    | id           | bigint(20)   | NO   | PRI | NULL    | auto_increment |
    | address      | varchar(255) | YES  |     | NULL    |                |
    | date_created | datetime     | YES  |     | NULL    |                |
    | last_updated | datetime     | YES  |     | NULL    |                |
    | employee_id  | bigint(20)   | YES  | MUL | NULL    |                |
    +--------------+--------------+------+-----+---------+----------------+
