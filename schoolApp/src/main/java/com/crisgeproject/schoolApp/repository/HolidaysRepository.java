package com.crisgeproject.schoolApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crisgeproject.schoolApp.model.Holiday;

@Repository
public interface HolidaysRepository extends CrudRepository<Holiday, Integer> {

	

}
