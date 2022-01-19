package com.example.newfremwork.controller;

import com.example.newfremwork.model.Employee;
import com.example.newfremwork.model.Student;
import com.example.newfremwork.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController{
    @Autowired
    Repository repositoryJPA;

        @RequestMapping(value = "/add_student",method = RequestMethod.POST)
    public String addStudent(@RequestBody Student student){

        return "addedstudent..."+student.getName();

    }
    @RequestMapping(value = "/get_student",method = RequestMethod.GET)
    public List<Employee> displayStudentList(){
        return repositoryJPA.findAll();
    }
    @RequestMapping(value = "/remove_student",method = RequestMethod.DELETE)
    public void removeStudent(@RequestParam long id){
        repositoryJPA.deleteById(id);
    }
}
