package com.aparna.mongoDBDemo.services;

import com.aparna.mongoDBDemo.Exceptions.DuplicateStudentException;
import com.aparna.mongoDBDemo.Exceptions.InSufficientInputFields;
import com.aparna.mongoDBDemo.Repository.StudentRepo;
import com.aparna.mongoDBDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImplemantion implements StudentServiceInterface{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student addStudent(Student std) {
        if(std.getStudId()==null || std.getStudName()==null || std.getPercentage()==null){
            throw new InSufficientInputFields("Some of the fields data are missing in the request body");
        }
        List<Student> students = studentRepo.findAll();
        if(students.contains(std))  throw new DuplicateStudentException("Student with given value is already present");
       return  studentRepo.save(std);
    }

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

    public void deleteAllStudentsData(){
        studentRepo.deleteAll();
    }
}
