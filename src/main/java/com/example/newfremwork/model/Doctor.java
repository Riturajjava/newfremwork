package com.example.newfremwork.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Doctor_table")
public class Doctor {


    public Doctor(){
 }
 @Id
 @GeneratedValue
 Long id;
 @Column(name="Doctor_name" )
      String name;
 @Column(name="Doctor_age")
         int age;
 @Column(name="Doctor_department")
       String dept;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return dept;
    }

    public void setDepartment(String department) {
        this.dept = department;
    }
}
