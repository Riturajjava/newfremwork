package com.example.newfremwork.controller;

import com.example.newfremwork.model.Doctor;
import com.example.newfremwork.repository.Repository;
import com.example.newfremwork.repository.RepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DoctorController {
@Autowired
    RepositoryJPA repositoryDoc;
   // List<Doctor>doctorList=new ArrayList<>();

@RequestMapping(value="/add_doctor",method= RequestMethod.POST)
  public String addDoctor(@RequestBody Doctor doctor){
    repositoryDoc.save(doctor);
    return  "added doctor..."+doctor.getName();
}
@RequestMapping(value = "/get_doctor",method=RequestMethod.GET)
    public List<Doctor> displayDoctorList(){
    return repositoryDoc.findAll();
}
@RequestMapping(value = "/remove_doctor",method = RequestMethod.DELETE)
    public void removeDoctor(@RequestParam Long id){
    repositoryDoc.deleteById(id);
  }

}
