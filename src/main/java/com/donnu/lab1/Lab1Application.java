package com.donnu.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class Lab1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "world!") String name){
        return String.format("Hello %s", name);
    }

    @GetMapping("/about")
    public String sayAbout(){
        return "about us";
    }

    @GetMapping("/options")
    public String sayOptions(@RequestParam(value = "myName", defaultValue = "") String name){
        if (name.equals("")) {
            return "options";
        } else {
            return "not an option";
        }
    }
}
