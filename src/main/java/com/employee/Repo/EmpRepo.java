package com.employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.Employee;
import com.employee.Model.EmpModel;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

	Employee save(EmpModel emp);

}
