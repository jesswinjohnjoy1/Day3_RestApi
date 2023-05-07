package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.StudentDay3;
import com.example.demo.Service.StudentServiceDay3;

public class ControllerClass {
	@Autowired
	StudentServiceDay3 serves;
	@PostMapping(" ")
	public String create(@RequestBody StudentDay3 customer)
	{
		return serves.adddetails(customer);
	}
	@GetMapping(" ")
	public List<StudentDay3> read()
	{
		return serves.getdetails();
	}
	@GetMapping("/{id}")
	public Optional<StudentDay3> readById(@PathVariable int id)
	{
		return serves.getdetailsById(id);
	}
}
