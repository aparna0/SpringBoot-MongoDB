package com.aparna.mongoDBDemo.controller;

import com.aparna.mongoDBDemo.model.Student;
import com.aparna.mongoDBDemo.services.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    Student st1;
    @Autowired
    StudentServiceInterface studentService;
    @RequestMapping("/test")
    public String demoController(){
        return "Hello Aparna!!!..."+"\n"+st1.toString();
    }

    @PostMapping("/addStudent")
    public Student saveStudent(@RequestBody Student std){
        return studentService.addStudent(std);
    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudents(){  return studentService.getStudents();    }

    @DeleteMapping("/deleteAllStudents")
    public void deleteStudentsData(){   studentService.deleteAllStudentsData();}
}
