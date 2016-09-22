# How To handle Inheritance with Entities

1. Mark your Base Entity class with annotation `@MappedSuperclass`.
2. Define all common fields and their getter setters in this class.
3. Make the base class abstract.
4. Make all fields as protected so that they can be accessed in inheriting class without getters and setter.
5. You can also define `@PrePersist` and `@PreUpdate` in this class.
6. Extend this class in User class and use `@AttributeOverride` to override the attributes defined in the BaseDomain class.


Classes to look.  

1. [BaseDomain.java](https://github.com/ekiras/spring-boot/blob/master/data-jpa/inheritance/attribute-override/src/main/java/com/ekiras/domain/base/BaseDomain.java)  
2. [User.java](https://github.com/ekiras/spring-boot/blob/master/data-jpa/inheritance/attribute-override/src/main/java/com/ekiras/domain/User.java)  

> **@AttributeOverride**  
>   
>  May be applied to an entity that extends a mapped superclass or
>  to an embedded field or property to override a basic mapping or id
>  mapping defined by the mapped superclass or embeddable class (or
>  embeddable class of one of its attributes).   
>     
>   May be applied to an element collection containing instances of
>  an embeddable class or to a map collection whose key and/or value
>  is an embeddable class. When <code>AttributeOverride</code> is
>  applied to a map, "<code>key.</code>" or "<code>value.</code>" must
>  be used to prefix the name of the attribute that is being
>  overridden in order to specify it as part of the map key or map
>  value.  
>       
>  To override mappings at multiple levels of embedding, a dot (".")
>  notation form must be used in the <code>name</code> element to indicate an
>  attribute within an embedded attribute.  The value of each identifier
>  used with the dot notation is the name of the respective embedded
>  field or property.  


## How to run the application
1. Open mysql and run the following command  
   a.  CREATE USER 'ekiras'@'localhost' IDENTIFIED BY 'pwd';  
   b.  GRANT ALL PRIVILEGES ON *.* TO 'ekiras'@'localhost' WITH GRANT OPTION;  
   c.  CREATE database jpa_mapping;  
2. Go to project localtion and run the application using the command
   ```
   gradle bootRun
   ```
  
  
