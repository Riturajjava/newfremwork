package com.example.newfremwork.controller;

import com.example.newfremwork.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.newfremwork.repository.Repository;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    Repository repositoryJPA;
   // List<Employee>employeeList=new ArrayList<>();

    @RequestMapping(value = "/add_employee",method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee){
       repositoryJPA.save(employee);
    return "added employee..."+employee.getName();
    }
    @RequestMapping(value = "/get_employee", method = RequestMethod.GET)
    public List<Employee>displayEmployeeList() {
        return repositoryJPA.findAll();

    }
       @RequestMapping(value = "/remove_employee",method = RequestMethod.DELETE)
    public void removeEmployee(@RequestParam Long id){
       repositoryJPA.deleteById(id);
        }

    }

