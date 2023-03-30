package com.example.C12Sprint5Demo.service;


import com.example.C12Sprint5Demo.Domain.Student;

import java.util.List;

public interface IStudentService {

   Student addStudent(Student student);

   List <Student> getAllStudent(); //get all records
}
