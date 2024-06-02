package com.ankit.springboot.ThymeleafDemo.controller;

import com.ankit.springboot.ThymeleafDemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Value("${countries}")
    private List<String> countries;
    @Value("${languages}")
    private List<String> languages;
    @Value("${systems}")
    private List<String> systems;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){
        //create a new student object
        Student student=new Student();
        //add that student bject to the model attribute
        theModel.addAttribute("student",student);
        //add the loist of contriesto the mdel
        theModel.addAttribute("countries",countries);
        //add the list of languages in the model
        theModel.addAttribute("languages", languages);

        //add thelist of system to themodel
        theModel.addAttribute("systems", systems);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public  String processForm(@ModelAttribute("student") Student theStudent){
        //log the input data
        System.out.println("theStudent :"+theStudent.getFirstName()+" "+theStudent.getLastName());
        return "student-Confirmation";
    }
}
