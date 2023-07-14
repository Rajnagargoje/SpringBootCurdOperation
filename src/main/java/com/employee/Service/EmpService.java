package com.employee.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.employee.Entity.Employee;
import com.employee.NoSuchElementError.*;

import com.employee.Repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo repository;
	//edfgUWEYRFGERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUIERYUI
	
	public Employee saveEmployee ( Employee emp) {
		
		Employee e =  repository.save(emp);
		return e;
		
	}
	
	public List<Employee> getAll( Employee emp){
		
		List<Employee> e = (List<Employee>)repository.findAll();
		return e;
		
	}
	
	public Employee getEmployee (int empId) {
		
		Employee e = repository.findById(empId).get();
		
		return e;
		
		
	}
	
	public void deleteEmployee (int empId) {
	  repository.deleteById(empId);
	 
	
	}
	
	public Employee updateEmployee(Employee emp ,Integer empId) {
		Employee e = repository.findById(empId).get();
		
		e.setName(emp.getName());
		e.setEmpId(emp.getEmpId());
		e.setAge(emp.getAge());
		e.setEmail(emp.getEmail());
		e.setMobile(emp.getMobile());
		
		return e;
	}
	
	
	
//	public Employee testEmployee (int empId) throws  NoSuchElementException  {
//		Employee emp = repository.findById(empId).get();
//		
//		if(emp != null) {
//			return emp;
//		} else {
//			throw new NoSuchElementException("User Not Found With This Id:" +empId);
//		}
//		
//	}
	
	public Employee testEmployee (int empId) {
		Employee emp = repository.findById(empId).get();
		
		if(emp != null ) {
			return emp;
			
		}else {
			throw new NoSuchElementException("No such User Id Found :" + empId);
		}
	}
	

}
