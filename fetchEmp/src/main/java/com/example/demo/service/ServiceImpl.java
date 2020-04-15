package com.example.demo.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoClass;
import com.example.demo.entites.Employee;

@Service
@Transactional


public class ServiceImpl implements ServiceIterface{
	
	@Autowired
	DaoClass dao;
    
    @Override
	public Employee getEmployeeById(int id) 
	{
	return dao.getEmployeeById(id);
	}
    
}
