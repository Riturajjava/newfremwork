package com.example.newfremwork.repository;

import com.example.newfremwork.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryJPA extends JpaRepository<Doctor,Long> {
}
