package com.example.projectemployee.controller;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectemployee.Employee;
import com.example.projectemployee.dao.EmployeeDao;

@RestController
public class EmployeeController {
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeDao empDao;
	
	
	@PostMapping("/employee")
	public Employee createEmpData(@RequestBody Employee empData) {
		logger.debug("Enter into createEmpData()");
		 empDao.save(empData);
		 return empData;
	}
	
	@PutMapping("/employee")
	public Employee updateEmpData(@RequestBody Employee empData) {
		 empDao.save(empData);
		 return empData;
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmpData() {
		
		return empDao.findAll();
	}
	
	@GetMapping("/employee/{eid}")
	public Optional<Employee> getEmpData(@PathVariable("eid") int id) {
		
		return empDao.findById(id);
	}
	
	@DeleteMapping("/employee/{eid}")
	public String deleteEmpData(@PathVariable("eid") int id) {
		
		Employee empdata =  empDao.getOne(id);
		empDao.delete(empdata);
		return "data deleted";
	}
	
}
