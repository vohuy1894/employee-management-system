package com.example.backend.services;

import java.util.List;

import com.example.backend.model.EmployeeModel;



public interface EmployeeService{

    EmployeeModel createEmployee(EmployeeModel employee);

    List<EmployeeModel> getAllEmployees();
    
}
