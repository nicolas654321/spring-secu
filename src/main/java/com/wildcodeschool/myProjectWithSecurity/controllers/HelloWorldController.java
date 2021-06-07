package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers... Assemble";
    }
    
    @GetMapping("/secret-bases")
    public String admin() {
        return "Les campus WildCodeSchools : Biarritz\r\n"
                + "Bordeaux\r\n"
                + "La Loupe 🌲\r\n"
                + "Lille\r\n"
                + "Lyon\r\n"
                + "Marseille\r\n"
                + "Nantes\r\n"
                + "Orléans\r\n"
                + "Paris\r\n"
                + "Reims\r\n"
                + "Saintes\r\n"
                + "Strasbourg\r\n"
                + "Toulouse\r\n"
                + "Tours\r\n"
                + "Europe\r\n"
                + "Amsterdam\r\n"
                + "Barcelone\r\n"
                + "Berlin\r\n"
                + "Bruxelles\r\n"
                + "Bucarest\r\n"
                + "Lisbonne\r\n"
                + "Londres\r\n"
                + "Madrid\r\n"
                + "À distance\r\n"
                + "";
    }

}