package com.example.newfremwork.controller;

import com.example.newfremwork.model.Employee;
import com.example.newfremwork.model.Teacher;
import com.example.newfremwork.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    Repository repositoryJPA;
    @RequestMapping(value = "/add_teacher",method = RequestMethod.POST)
    public String addTeacher(@RequestBody Teacher teacher){
        return "addedteacher..."+teacher.getName();
    }
    @RequestMapping(value = "/get_teacher",method = RequestMethod.GET)
    public List<Employee> displayTeacherList(){

        return repositoryJPA.findAll();
    }
    @RequestMapping(value = "/remove_teacher",method = RequestMethod.DELETE)
    public void removeteacher(@RequestParam long id){
        repositoryJPA.deleteById(id);
    }

}
