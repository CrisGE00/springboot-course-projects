package com.crisgeproject.schoolApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crisgeproject.schoolApp.constants.ScholAppConstants;
import com.crisgeproject.schoolApp.model.Person;
import com.crisgeproject.schoolApp.model.Roles;
import com.crisgeproject.schoolApp.repository.PersonRepository;
import com.crisgeproject.schoolApp.repository.RolesRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        Roles role = rolesRepository.getByRoleName(ScholAppConstants.STUDENT_ROLE);
        person.setRoles(role);
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}