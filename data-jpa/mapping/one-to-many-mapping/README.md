# How To handle Inheritance with Entities

1. Mark your Base Entity class with annotation `@MappedSuperclass`.
2. Define all common fields and their getter setters in this class.
3. Make the base class abstract.
4. Make all fields as protected so that they can be accessed in inheriting class without getters and setter.
5. You can also define `@PrePersist` and `@PreUpdate` in this class.


Classes to look.  

1. [BaseDomain.java](https://github.com/ekiras/spring-boot/blob/master/data-jpa/inheritance/mapped-super-class/src/main/java/com/ekiras/domain/base/BaseDomain.java)  
2. [User.java](https://github.com/ekiras/spring-boot/blob/master/data-jpa/inheritance/mapped-super-class/src/main/java/com/ekiras/domain/User.java)  

> **@MappedSuperclass**  
>   
>  A class designated with the <code>MappedSuperclass</code>
  annotation can be mapped in the same way as an entity except that the
  mappings will apply only to its subclasses since no table
  exists for the mapped superclass itself. When applied to the
  subclasses the inherited mappings will apply in the context
  of the subclass tables.
