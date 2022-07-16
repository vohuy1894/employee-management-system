package com.example.backend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.backend.entity.EmploymentEntity;
import com.example.backend.model.EmployeeModel;
import com.example.backend.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        EmploymentEntity employeeEntity = new EmploymentEntity();
        BeanUtils.copyProperties(employeeModel, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employeeModel;
    }

    @Override
    public List<EmployeeModel> getAllEmployees(){
        List<EmploymentEntity> employeeEntity = employeeRepository.findAll();
        List<EmployeeModel> employees = employeeEntity.stream().map(emp -> new EmployeeModel(emp.getId(), emp.getEmailId(), emp.getFirstName(), emp.getLastName())).collect(Collectors.toList());
        return employees;
    }
}
