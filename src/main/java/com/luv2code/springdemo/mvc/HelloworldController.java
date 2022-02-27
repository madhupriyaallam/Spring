package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller; // by adding boot-starter artifact
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping; // by adding spring - web artifact

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloworldController {

    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }
    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
    // add a new controller method to read from data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase(Locale.ROOT);

        String result = "Yo! " + theName;

        model.addAttribute("message", result);


        return "helloworld";

    }
}