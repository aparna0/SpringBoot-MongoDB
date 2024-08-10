package com.aparna.mongoDBDemo.services;

import com.aparna.mongoDBDemo.Exceptions.DuplicateStudentException;
import com.aparna.mongoDBDemo.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentServiceInterface {
    public Student addStudent(Student std) throws DuplicateStudentException;

    public List<Student> getStudents();

    public void deleteAllStudentsData();
}
