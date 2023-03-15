package com.movti.movticalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorInterface service;

    public Controller(CalculatorInterface service) {
        this.service = service;
    }

    @GetMapping()
    public String welcomeToCalculator(){
        return service.welcomeToCalculator();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam String num1, @RequestParam String num2) {
        if(num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()){
            return "ошибка";
        }

        return num1 + " + " + num2 + " = " + service.sum(Integer.parseInt(num1),Integer.parseInt(num2));
    }
    @GetMapping("/minus")
    public String minus(@RequestParam String num1, @RequestParam String num2) {
        if(num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()){
            return "ошибка";
        }

        return num1 + " - " + num2 + " = " + service.minus(Integer.parseInt(num1),Integer.parseInt(num2));
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam String num1, @RequestParam String num2) {
        if(num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()){
            return "ошибка";
        }

        return num1 + " * " + num2 + " = " + service.multiply(Integer.parseInt(num1),Integer.parseInt(num2));
    }
    @GetMapping("/divide")
    public String divide(@RequestParam String num1, @RequestParam String num2) {
        if(num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()){
            return "ошибка";
        }
        if(num2.equals("0")){
            return "на ноль делить нельзя";
        }


        return num1 + " / " + num2 + " = " + service.divide(Integer.parseInt(num1),Integer.parseInt(num2));
    }

}


