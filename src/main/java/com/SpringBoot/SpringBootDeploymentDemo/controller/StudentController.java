package com.SpringBoot.SpringBootDeploymentDemo.controller;


import com.SpringBoot.SpringBootDeploymentDemo.entity.Student;
import com.SpringBoot.SpringBootDeploymentDemo.servises.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {


    @Autowired
    StudentService studentService;


    @PostMapping
    public Student saveStudents(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}
