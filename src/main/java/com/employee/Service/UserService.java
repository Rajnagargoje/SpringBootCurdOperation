package com.employee.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Entity.User;
import com.employee.Model.UserRequest;

import com.employee.NoSuchElementError.UserNotFoundException;
import com.employee.Repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	public User saveUser(UserRequest userRequest) throws UserNotFoundException{		

		 User user = User.build(userRequest.getUserId(), userRequest.getName(), userRequest.getEmail(), userRequest.getGender(), userRequest.getAge(), userRequest.getCompany());		
		 
		
User userr=  repository.findByEmail(userRequest.getEmail());


		
		if(userr == null) {
			return	  repository.save(user);
		} else {
			throw new UserNotFoundException("Email already esxit please try another one ");
			
		}
		 
		
		
	}
		
	

          
		
	
	
	public List<User> getAllUsers(){
		return repository.findAll();
	}

	public boolean deleteUser(int id) throws UserNotFoundException {
		
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}else {
			throw new UserNotFoundException("Id Not exist");
		}
		
		
	}
	
	public User updateUser( User u ,int id) throws UserNotFoundException {
		User user = repository.findByUserId(id);
		
		if(user != null) {
			user.setAge(u.getAge());
			user.setCompany(u.getCompany());
			user.setEmail(u.getEmail());
			user.setGender(u.getGender());
			user.setName(u.getName());
		
			 return user;
		} else {
			throw new UserNotFoundException("User Not found With Id: "+id);
		}
		
		
	}
	
	
	
	
	public User getUser(int id) throws UserNotFoundException {
		User user=  repository.findByUserId(id);
		
		if(user != null) {
			return user;
		} else {
			throw new UserNotFoundException("User Not found With Id: "+id);
			
		}
		
	}
	
	
}
