package com.example.backend.repository;
import com.example.backend.entity.EmploymentEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmploymentEntity,Long>{
    
}
