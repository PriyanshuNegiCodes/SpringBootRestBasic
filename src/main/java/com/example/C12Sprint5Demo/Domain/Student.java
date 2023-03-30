package com.example.C12Sprint5Demo.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

//The entitiy shows that the table name will be the student in the database
@Entity
public class Student {

    //Id  shows that int stuId will be the primary key in the table
    @Id
    private int stuId;
    private String name;
    private String email;

    public Student() {
    }

    public Student(int stuId, String name, String email) {
        this.stuId = stuId;
        this.name = name;
        this.email = email;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
