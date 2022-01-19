package com.example.newfremwork.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @RequestMapping("/add/{a}/{b}")
    public int addPath(@PathVariable int a,@PathVariable int b){
        int add=a+b;
        return add;
    }
    @RequestMapping("/add")
    public int addParam(@RequestParam int a,@RequestParam int b){
        int add=a+b;
        return add;
    }
    @RequestMapping("/sub/{a}/{b}")
    public int subPath(@PathVariable int a, @PathVariable int b){
        int sub=a-b;
        return sub;
    }
    @RequestMapping("/sub")
    public int subParam(@RequestParam int a, @RequestParam int b){
        int sub=a-b;
        return sub;
    }
    @RequestMapping("/multiply/{a}/{b}")
    public int multiplyPath(@PathVariable int a, @PathVariable int b){
        int multiply=a*b;
        return multiply;
    }
    @RequestMapping("/multiply")
    public int multiplyParam(@RequestParam int a, @RequestParam int b){
        int multiply=a*b;
        return multiply;
    }
    @RequestMapping("/divide/{a}/{b}")
    public int dividePath(@PathVariable int a, @PathVariable int b){
        int divide=a/b;
        return divide;
    }
    @RequestMapping("/divide")
    public int divideParam(@RequestParam int a, @RequestParam int b){
        int divide=a/b;
        return divide;
    }
}
