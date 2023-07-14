package com.employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class Employee {
	
	@Id
	@GeneratedValue
	
	private int empId;
	@NotNull(message = "Username is Required!!!!")
	private String name;
	
	@Email(message = "Invalid Email !!!!")
	private String email;
	@NotNull
	@Pattern(regexp = "^\\d{10}$" , message="Invalid Mobile Number !!!")
	private String mobile;
	
	@Min(18)
	@Max(60)
	private int age;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String name, String email, String mobile, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.age = age;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", age="
				+ age + "]";
	}

	
	

}
