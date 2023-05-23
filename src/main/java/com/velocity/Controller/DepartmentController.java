package com.velocity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.Entity.Department;
import com.velocity.Service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;
	
	 @PostMapping("/departments")
	 
	    public Department saveDepartment(
	        @RequestBody Department department)
	    {
	        return departmentservice.saveDepartment(department);
	    }
	 
	    // Read operation
	   @GetMapping("/departments")
	   public List<Department>fetchDepartmentList()
	  {
	       return departmentservice.fetchDepartmentList();
	   }
	 
	    // Update operation
	    @PutMapping("/departments/{id}")
	 
	    public Department
	    updateDepartment(@RequestBody Department department,
	                     @PathVariable("id") Integer departmentId)
	    {
	        return departmentservice.updateDepartment(
	            department, departmentId);
	    }
	 
	    // Delete operation
	    @DeleteMapping("/departments/{id}")
	 
	    public String deleteDepartmentById(@PathVariable("id")
	                                       Integer departmentId)
	    {
	        departmentservice.deleteDepartmentById(departmentId);
	        return "Deleted Successfully";
	    }
	}

