package com.ekiras.repository;

import com.ekiras.domain.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author ekiras
 */
public interface DepartmentRepository extends CrudRepository<Department,Long>{

    List<Department> findAll();

}
