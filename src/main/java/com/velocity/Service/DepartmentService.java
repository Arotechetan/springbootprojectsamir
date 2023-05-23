package com.velocity.Service;

import java.util.List;

import com.velocity.Entity.Department;

public interface DepartmentService {

	//save operation
	Department saveDepartment(Department department);
	
	 // Read operation
    List<Department> fetchDepartmentList();
 
    // Update operation
    Department updateDepartment(Department department,
                                Integer departmentId);
 
    // Delete operation
   // void deleteDepartmentById(Long departmentId);

	void deleteDepartmentById(Integer departmentId);
}

