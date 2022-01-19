package com.example.newfremwork.controller;

import com.example.newfremwork.model.Employee;
import com.example.newfremwork.model.Engineer;
import com.example.newfremwork.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerController {

    @Autowired
    Repository repositoryJPA;
   // List<Engineer>engineerList=new ArrayList<>();
    @RequestMapping(value = "/add_engineer",method = RequestMethod.POST)
    public String addEngineer(@RequestBody Engineer engineer){

        return"added engineer..."+engineer.getName();
    }
    @RequestMapping(value = "/get_engineer",method = RequestMethod.GET)
    public List<Employee> displayEngineerList(){

        return repositoryJPA.findAll();
    }
    @RequestMapping(value = "/remove_engineer",method = RequestMethod.DELETE)
    public void removeEngineer(@RequestParam long id){
        repositoryJPA.deleteById(id);
    }


}
