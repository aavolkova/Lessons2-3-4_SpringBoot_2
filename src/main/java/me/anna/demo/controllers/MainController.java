package me.anna.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

// Lesson #2
//    @GetMapping("/")
//    public String homePage(Model model){
//        model.addAttribute("myvariable", "Say hello to the people.");
//        return "index";
//    }

//    // Lesson #3
//    @RequestMapping ("/")
//    public String homePage(){
//        return "index";
//    }



    // Lesson #4-1
    @RequestMapping ("/")
    public String loadFormPage(){
        return "index";
    }

    // Lesson #4-2
    @RequestMapping ("/processform")
    public String loadFormPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval", login);
        return "index";
    }

//    // Lesson #4-1
//    @RequestMapping ("/loadform")
//    public String loadFormPage(){
//        return "formtemplate";
//    }
//
//    // Lesson #4-2
//    @RequestMapping ("/processform")
//    public String loadFormPage(@RequestParam("login") String login, Model model){
//        model.addAttribute("loginval", login);
//        return "confirm";
//    }












}
