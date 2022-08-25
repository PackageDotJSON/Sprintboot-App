package com.example.SpringbootBackend.repository;

import com.example.SpringbootBackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
