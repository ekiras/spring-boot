package com.ekiras.repository;

import com.ekiras.domain.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author ekiras
 */
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

    List<Employee> findAll();

    Employee findById(long id);
}
