package com.SpringBoot.SpringBootDeploymentDemo.repository;

import com.SpringBoot.SpringBootDeploymentDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
