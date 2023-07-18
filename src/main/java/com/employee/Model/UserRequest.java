package com.employee.Model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
	
	private int userId;
	
	@NotNull(message="Username Required!!!!")
	private String name;
	
	
	
	@Email(message="Invalid Email Address!!")
	private String email;
	
	
	private String gender;
	@Min(18)
	@Max(60)
	private int age;
	@NotNull(message="You Have To fill the Company Field")
	private String company;
	
	

}
