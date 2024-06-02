package com.ankit.springboot.ThymeleafDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    //need a controller method to read form data
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        //read the request parameter from the html form
        String theName=request.getParameter("studentName");
        //convert that data to all upppercase
        theName=theName.toUpperCase();
        //create a message
        String result="Yo!"+theName;
        //add that method to the model
        model.addAttribute("message",result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        //here above "studentName" is HTML form field and in "theName" we are assigning the value of request parameter
        //convert that data to all upppercase
        theName=theName.toUpperCase();
        //create a message
        String result="Hey My friend from v3 !"+theName;
        //add that method to the model
        model.addAttribute("message",result);

        return "helloworld";
    }




}
