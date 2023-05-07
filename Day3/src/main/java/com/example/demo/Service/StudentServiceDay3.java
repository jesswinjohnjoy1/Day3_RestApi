package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.StudentDay3;
import com.example.demo.Repository.StudentRepoDay3;

public class StudentServiceDay3 {
	@Autowired
	StudentRepoDay3 srepo;
	public String adddetails(StudentDay3 stu)
	{
		srepo.save(stu);
		return "Added Successfully";
	}
	public List<StudentDay3> getdetails()
	{
		return srepo.findAll();
	}
	public Optional<StudentDay3> getdetailsById(int id)
	{
		return srepo.findById(id);
	}
	
}
