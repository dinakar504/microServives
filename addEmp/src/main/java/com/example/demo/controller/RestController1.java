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
	//Create Employee
	@PostMapping("/EmployeeCreation")
	public Employee EmployeeCreation(@RequestBody Employee emp)
	{
		return serviceobj.EmployeeCreation(emp);
	}

	

}