package com.SpringBoot.SpringBootDeploymentDemo.servises;

import com.SpringBoot.SpringBootDeploymentDemo.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> getStudents();
}
