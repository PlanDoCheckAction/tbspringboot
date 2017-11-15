package com.example.tbspringboot.controller;

import com.example.tbspringboot.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public String person(Model model){
        Person single = new Person("aa",11);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("XX",11);
        Person p2 = new Person("YY",22);
        Person p3 = new Person("ZZ",33);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);

        return "index";
    }
}
