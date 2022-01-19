package com.example.newfremwork.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employee_Table")

public class Employee {
    public Employee(){

    }
    @Id
    @GeneratedValue
    Long id;
    @Column(name="Employee_name")
      String name;
    @Column(name="Employee_age")
    int age;
    @Column(name="Employee_dept")
    String department;

    public Employee(int age, String name, Long id, String department) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.department = department;
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
