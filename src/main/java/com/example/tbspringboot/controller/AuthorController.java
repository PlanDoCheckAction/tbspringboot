package com.example.tbspringboot.controller;

import com.example.tbspringboot.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/author")
    public String index(){
        return "Author name is : " + authorSettings.getName()+" ;Author age is: " + authorSettings.getAge();
    }

}
