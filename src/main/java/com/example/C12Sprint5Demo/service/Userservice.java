package com.example.C12Sprint5Demo.service;

import com.example.C12Sprint5Demo.Domain.Student;
import com.example.C12Sprint5Demo.repositry.IStudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice implements IStudentService {
    IStudentRepositry studentRepositry;

    @Autowired
    public Userservice(IStudentRepositry studentRepositry) {
        this.studentRepositry = studentRepositry;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepositry.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepositry.findAll();
    }
}
