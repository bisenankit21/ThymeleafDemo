package com.ankit.springboot.ThymeleafDemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    //create a mapping for "/hello"
    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("theDate", java.time.LocalDateTime.now());
        return "helloworld"; //we have thyemleaf dependency in maven pom so spring boot will auto configure to use thymmeleaf
                              //so it will check this string in src/main/resources/templates/helloworld.html
    }
}
