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
	 
	 public String deleteEmp(int id)
	 {
		 Employee e=em.find(Employee.class,id);
		 if(e==null)
		 {
			 return "ID not present";
			 
		 }
		 else
		 {
			 System.out.println(id);
			 em.remove(e);
			 return "Successful";
		 }
	 }
	
	 
	 
}
