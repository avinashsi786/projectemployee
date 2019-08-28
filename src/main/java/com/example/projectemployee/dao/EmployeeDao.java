package com.example.projectemployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectemployee.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
