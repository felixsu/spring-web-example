package com.felix.mws.service;

import com.felix.mws.model.dao.GenericRepository;
import com.felix.mws.model.dao.PersonDao;
import com.felix.mws.model.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fsoewito on 2/20/2016.
 */

@Service
public class PersonService extends GenericService <Person, Integer>{

    @Autowired
    public PersonService(PersonDao repository) {
        super(repository);
    }
}
