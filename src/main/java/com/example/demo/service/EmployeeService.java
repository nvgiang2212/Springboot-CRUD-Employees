package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAll();
    List<Employee> findAllById(Long id);
    Employee findByIdEmployee(Long id);
    void save(Employee employee);
    void delete(Long id);
}
