package com.SpringBoot.SpringBootDeploymentDemo.servises.Implemantetion;

import com.SpringBoot.SpringBootDeploymentDemo.entity.Student;
import com.SpringBoot.SpringBootDeploymentDemo.repository.StudentRepo;
import com.SpringBoot.SpringBootDeploymentDemo.servises.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl  implements StudentService {

    @Autowired
    StudentRepo studentRepo;


    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}
