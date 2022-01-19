package com.example.newfremwork.controller;

import com.example.newfremwork.model.Engineer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoPath {
    List<Engineer> engineerList = new ArrayList<>();

    @RequestMapping("/word/{message}")
    public String word(@PathVariable String message) {
        String word = "word accepted.." + message;
        return word;
    }
    @RequestMapping("wel/{msg}")
    public String name(@PathVariable String msg){
        String na="Welcome " +msg;
        return na ;
    }


}
