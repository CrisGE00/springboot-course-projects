package com.crisgeproject.schoolApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crisgeproject.schoolApp.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

	List<Contact> findByStatus(String status);

}
