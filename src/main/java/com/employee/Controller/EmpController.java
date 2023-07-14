package com.employee.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Entity.Employee;

import com.employee.Service.EmpService;

import jakarta.validation.Valid;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody @Valid Employee emp) {
		
		
		return service.saveEmployee(emp);
		
	}
	
	@GetMapping("/getall")
   public List<Employee> getAll(@RequestBody Employee emp){
		
		List<Employee> e = (List<Employee>)service.getAll(emp);
		return e;
		
	}
	
	@GetMapping("/get/{empId}")
	public Employee getOneEmployee(@PathVariable Integer empId) {
		
		return service.getEmployee(empId);
	}
	
	
	@DeleteMapping("/delete/{empId}")
	public void deleteEmployee(@PathVariable Integer empId) {
		 service.deleteEmployee(empId);
	}
	
	
	@PutMapping("/put/{empId}")
	public Employee updateEmployee(@RequestBody Employee emp,@PathVariable Integer empId) {
		
		return service.updateEmployee(emp, empId);
		
	}
	
//	@GetMapping("/{empId}")
//	public Employee checkkEmployee(@PathVariable Integer empId)  throws  NoSuchElementException  {
//		
//		return service.testEmployee(empId);
//	}
	
	@GetMapping("/empId")
	public Employee checkEmployee (@PathVariable Integer empId) {
		return service.testEmployee(empId);
	}

}
