package com.example.C12Sprint5Demo.repositry;

import com.example.C12Sprint5Demo.Domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IStudentRepositry  extends CrudRepository <Student, Integer> {
//Generic type
    // System defined interface which has ethod from curd operatoin
    // there are other interface to support CRUD operatoins

    // the class CrudRepository will be provided at the run time because
    // we added the dependency for the JPA and the same depnedency will provide the implementation for it
}
