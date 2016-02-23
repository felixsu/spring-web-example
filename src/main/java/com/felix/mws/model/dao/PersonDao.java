package com.felix.mws.model.dao;

import com.felix.mws.model.entity.Person;
import org.springframework.stereotype.Repository;

/**
 * Created by fsoewito on 2/20/2016.
 */

public interface PersonDao extends GenericRepository<Person, Integer> {
    Person findByName(String name);
}
