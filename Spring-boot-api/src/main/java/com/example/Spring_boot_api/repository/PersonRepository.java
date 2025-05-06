package com.example.Spring_boot_api.repository;

import com.example.Spring_boot_api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long>{
}
