package com.example.CRUDOperationOffice.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")

public class StudentController {

      private final StudentService studentService;

      @Autowired
      public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(com.example.CRUDOperationOffice.CrudOperationOfficeApplication.class, args);

    }
        @GetMapping
        public List<Student> getsStudents () {
        return studentService.getsStudents();


        }
    }

