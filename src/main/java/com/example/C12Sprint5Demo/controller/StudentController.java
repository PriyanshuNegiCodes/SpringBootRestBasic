package com.example.C12Sprint5Demo.controller;

import com.example.C12Sprint5Demo.Domain.Student;
import com.example.C12Sprint5Demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/v1") //common path
public class StudentController {
    IStudentService iStudentService;
    @Autowired
    public StudentController(IStudentService iStudentService){
        this.iStudentService=iStudentService;
    }
    //this is the method in the controller

    //@RequestBody convert the json object to java object
    @PostMapping("/user")
    public ResponseEntity addStudent (@RequestBody Student student){

        Student student1=iStudentService.addStudent(student);
        return new ResponseEntity( student1, HttpStatus.CREATED);
    }

    //add student is the method in the service layer

    @GetMapping("/users")
    public ResponseEntity getAllStudents(){
        List<Student> students=iStudentService.getAllStudent();
        return new ResponseEntity(students, HttpStatus.OK);
    }

}
