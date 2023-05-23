package com.velocity.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Entity.Department;
import com.velocity.Repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
    private DepartmentRepository departmentrepository;
	
	
//save operation
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentrepository.save(department);
	}
	
	
//read operation
	public List<Department> featchDepartmentList() {
		// TODO Auto-generated method stub
		return (List<Department>)departmentrepository.findAll();
	}
//update operation
	public Department updateDepartment(Department department, Integer id) {
		// TODO Auto-generated method stub
		 Department depDB
         = departmentrepository.findById(id)
               .get();

     if (Objects.nonNull(department.getName())
         && !"".equalsIgnoreCase(
             department.getName())) {
         depDB.setName(
             department.getName());
     }

     if (Objects.nonNull(
             department.getAddress())
         && !"".equalsIgnoreCase(
             department.getAddress())) {
         depDB.setAddress(
             department.getAddress());
     }

     if (Objects.nonNull(department.getCode())
         && !"".equalsIgnoreCase(
             department.getCode())) {
         depDB.setCode(
             department.getCode());
     }

     return departmentrepository.save(depDB);
	}
//Delete operation
	public void deleteDepartmentByID(Integer id) {
		// TODO Auto-generated method stub
		departmentrepository.deleteById(id);
	}


	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return null;
	}


	//public Department updateDepartment(Department department, Integer id) {
	//	// TODO Auto-generated method stub
	//	return null;
//	}


	public void deleteDepartmentById(Integer id) {
		// TODO Auto-generated method stub
		
	
		
	}

}
