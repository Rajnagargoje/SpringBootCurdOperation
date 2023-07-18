package com.employee.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Table(name="USER_TBL")
public class User {
	
	@Id
	@GeneratedValue
	
	private int userId;
	private String name;
	
	
	
	private String email;
	private String gender;
	private int age;
	private String company;
	

}
