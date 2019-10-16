package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    Employee findByIdEmployee(Long id);

    void save(Employee employee);

    void delete(Long id);

}
