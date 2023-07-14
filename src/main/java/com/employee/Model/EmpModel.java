package com.employee.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class EmpModel {
	@Id
	@GeneratedValue
	private int empId;
	private String name;
	private String email;
	private String mobile;
	private int age;
	
	public EmpModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpModel(int empId, String name, String email, String mobile, int age) {
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
		return "EmpModel [empId=" + empId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", age="
				+ age + "]";
	}


}
