package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entites.Employee;
import com.example.demo.service.ServiceImpl;
import com.example.demo.service.ServiceIterface;

@RestController

@CrossOrigin("http://localhost:4200")

public class RestController1 
{
	@Autowired
	ServiceIterface serviceobj;
	@Autowired
	RestTemplate rest;
	//Create Employee
	
	//Get Particular Employee Data
	@GetMapping("/GetEmployee/{id}")
	private ResponseEntity<Employee> getEmployee(@PathVariable("id") int id) 
	{
		Employee emp = serviceobj.getEmployeeById(id);
		if(emp == null) {
			ResponseEntity<Employee>  responseEntity = new ResponseEntity<Employee>(emp,HttpStatus.OK);
			return responseEntity;
		}
		else {
			ResponseEntity<Employee>  responseEntity = new ResponseEntity<Employee>(emp,HttpStatus.OK);
			return responseEntity;
		}
	}

	
	

}