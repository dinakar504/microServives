package com.example.demo.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.entites.Employee;

@Repository
public class DaoClass {
	 @PersistenceContext
	    private EntityManager em;
	 public DaoClass() {
		// TODO Auto-generated constructor stub
	}
	 
	 public String UpdateEmployee(Employee emp) {
			Employee e=em.find(Employee.class,emp.getId());
			if(e==null)
				return "Provided Employee id was not found";
			else
			{
				System.out.println(emp.getId());
				em.merge(emp);
				return "Updated Employee Info Successfully!";
			}
				
		}
	 
	
	 
}
