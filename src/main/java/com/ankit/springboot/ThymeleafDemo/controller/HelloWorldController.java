package com.ankit.springboot.ThymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    //need controler to show initital form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";

    }
    //need cpnttolerr method to process the form

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";

    }



}
