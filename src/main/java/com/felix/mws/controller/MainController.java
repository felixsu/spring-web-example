package com.felix.mws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fsoewito on 2/19/2016.
 */

@Controller
public class MainController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET
    )
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        model.addObject("title", "Welcome!");
        model.addObject("time", new Date().toString());
        model.addObject("message", "Service's up and running");

        return model;
    }

    @RequestMapping(
            value = "/exception",
            method = RequestMethod.GET
    )
    public String helloException() throws Exception {
        throw new Exception("hi exception");
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> handleAllException(Exception ex) {

        Map<String, Object> result = new HashMap<>();

        result.put("info", "allExceptionHandler");
        return result;
    }


}
