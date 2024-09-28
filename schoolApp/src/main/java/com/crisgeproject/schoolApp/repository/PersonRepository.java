package com.crisgeproject.schoolApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crisgeproject.schoolApp.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
