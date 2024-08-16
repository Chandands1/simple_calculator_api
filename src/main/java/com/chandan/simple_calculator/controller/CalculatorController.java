package com.chandan.simple_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class CalculatorController {

   @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a+b;
    }

    @GetMapping("/sub")
    public double sub(@RequestParam double a, @RequestParam double b) {
       return a-b;
    }

    @GetMapping("/mul")
    public double multiple(@RequestParam double a, @RequestParam double b) {
       return a*b;

    }

    @GetMapping("/div")
    public double division(@RequestParam double a, @RequestParam double b) {

       return  a/b;
    }

    @GetMapping("/mod")
    public double mod(@RequestParam double a, @RequestParam double b) {
       return a%b;
    }
}
