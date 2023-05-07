package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.StudentDay3;

@Repository
public interface StudentRepoDay3 extends JpaRepository<StudentDay3,Integer> {

}
