package com.example.backend.services;

import java.util.List;

import com.example.backend.model.EmployeeModel;



public interface EmployeeService{

    EmployeeModel createEmployee(EmployeeModel employee);

    List<EmployeeModel> getAllEmployees();

    boolean deleteEmployee(Long id);

    EmployeeModel getEmployeeById(Long id);

    EmployeeModel updateEmployee(Long id, EmployeeModel employee);
    
}
