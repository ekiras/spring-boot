package com.ekiras.service;

import com.ekiras.domain.Address;
import com.ekiras.domain.Employee;
import com.ekiras.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ekiras
 */
@Service
public class EmployeeService {

    @Autowired private EmployeeRepository employeeRepository;

    public Object list() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        employee.getAddress().setEmployee(employee);
        return employeeRepository.save(employee);
    }

    public Employee get(long id) {
        return employeeRepository.findById(id);
    }

    public Employee update(Employee employee) {
        Employee old = employeeRepository.findById(employee.getId());
        old.setName(employee.getName());
        old.setEmail(employee.getEmail());
        old.setPassword(employee.getPassword());
        old.getAddress().setAddress(employee.getAddress().getAddress());
        employee = employeeRepository.save(old);
        return employee;
    }

    public void delete(long id) {
        employeeRepository.delete(id);
    }
}
