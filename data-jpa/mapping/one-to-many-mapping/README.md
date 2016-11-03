# One To Many Mapping 

[Read Full Description](http://www.ekiras.com/2016/11/one-to-many-mapping-in-spring-boot-spring-data-jpa-hibernate.html)
---


> **Also Read**   
> 1. [One to One Mapping](http://www.ekiras.com/2016/09/one-to-one-mapping-in-spring-boot-spring-data-jpa-hibernate.html)  
> 2. [One to Many Mapping](http://www.ekiras.com/2016/11/one-to-many-mapping-in-spring-boot-spring-data-jpa-hibernate.html)


Lets take two entities/domains  

1.  Employee
2.  Department

Where the relation between the two enties is, A Department can have multiple Employees but an Employee can belong to only one Department i.e One To Many (Employee <- Department).

Simplest code to make this mapping can be as follows.

## Employee.java
    @Entity
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        protected long id;

        @ManyToOne(fetch = FetchType.EAGER)
        private Department department;

    }

## Department.java

    @Entity
    public class Department {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private long id;

      @OneToMany(cascade = CascadeType.ALL,mappedBy = "department", fetch = FetchType.LAZY)
      private List<Employee> employees;
    
    }
    
Here When you fetch the 
1.  Employee, it will automatically fetch Department due to ** FetchType.EAGER**
2.  Department, it will not fetch Employees due to **FetchType.LAZY**

## Sample table structure 

    mysql> desc employee;
    +---------------+--------------+------+-----+---------+----------------+
    | Field         | Type         | Null | Key | Default | Extra          |
    +---------------+--------------+------+-----+---------+----------------+
    | id            | bigint(20)   | NO   | PRI | NULL    | auto_increment |
    | date_created  | datetime     | YES  |     | NULL    |                |
    | email         | varchar(255) | YES  |     | NULL    |                |
    | last_updated  | datetime     | YES  |     | NULL    |                |
    | name          | varchar(255) | YES  |     | NULL    |                |
    | password      | varchar(255) | YES  |     | NULL    |                |
    | department_id | bigint(20)   | YES  | MUL | NULL    |                |
    +---------------+--------------+------+-----+---------+----------------+

    mysql> desc department;
    +--------------+--------------+------+-----+---------+----------------+
    | Field        | Type         | Null | Key | Default | Extra          |
    +--------------+--------------+------+-----+---------+----------------+
    | id           | bigint(20)   | NO   | PRI | NULL    | auto_increment |
    | date_created | datetime     | YES  |     | NULL    |                |
    | last_updated | datetime     | YES  |     | NULL    |                |
    | name         | varchar(255) | YES  |     | NULL    |                |
    +--------------+--------------+------+-----+---------+----------------+
