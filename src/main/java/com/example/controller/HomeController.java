package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController {

    @Value("${superman.name}")
    private String supername;

    // 最快速的建立MVC方式
    @RequestMapping(value="/", method = RequestMethod.GET)
    String home() {
        System.out.println("Super Name:"+supername);
//        return "Hello World!";
        return "index";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }
}
