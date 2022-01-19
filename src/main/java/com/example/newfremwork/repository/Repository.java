package com.example.newfremwork.repository;

import com.example.newfremwork.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Employee,Long> {

}
