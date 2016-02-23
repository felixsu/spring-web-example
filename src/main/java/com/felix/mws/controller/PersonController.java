package com.felix.mws.controller;

import com.felix.mws.model.dao.PersonDao;
import com.felix.mws.model.entity.Person;
import com.felix.mws.service.GenericService;
import com.felix.mws.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fsoewito on 2/20/2016.
 */

@Controller
@RequestMapping(value = "/person")
public class PersonController extends GenericController<Person, Integer> {

    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        super(service);
        this.service = service;
    }


}
