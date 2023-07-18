package com.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Entity.User;
import com.employee.Model.UserRequest;

import com.employee.NoSuchElementError.UserNotFoundException;
import com.employee.Service.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest ) throws UserNotFoundException{
		
		return new ResponseEntity<>(service.saveUser(userRequest),HttpStatus.CREATED);
		
		
	}	
		@GetMapping("/getall")
		public ResponseEntity<List<User>>getAllUsers(){
			
			return ResponseEntity.ok(service.getAllUsers());
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException{
			return ResponseEntity.ok(service.getUser(id));
		}
		
		@DeleteMapping("/delete/{id}")
		public void deleteUsers(@PathVariable int id) throws UserNotFoundException{
			service.deleteUser(id);
//			return "Record Deleted Successfully";
		
			
		}
		
		@PutMapping("/update/{id}")
		public User updateUsers(@RequestBody User u, @PathVariable int id) throws UserNotFoundException {
			
			User user = service.updateUser(u, id);
			
			return user;
		}
		
		
	
		}
			
		
	
	


