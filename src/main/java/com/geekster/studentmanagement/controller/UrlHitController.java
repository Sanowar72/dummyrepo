package com.geekster.studentmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("url-counter")
public class UrlHitController {
HashMap<String,Integer> urlCounter=new HashMap<>();
    @GetMapping("home")
    public String home(){
        return "this is home route for url-counter";
    }
    @GetMapping("{name}")
    public String urlCounter(@PathVariable String name){
        urlCounter.put(name,urlCounter.getOrDefault(name,0)+1);
        return "you hitted this url "+urlCounter.get(name)+" times";
    }
}
