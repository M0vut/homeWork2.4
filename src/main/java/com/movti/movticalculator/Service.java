package com.movti.movticalculator;


@org.springframework.stereotype.Service
public class Service implements CalculatorInterface {


    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор !!!";
    }

    public int sum(int num1, int num2) {
        return num1 + num2;


    }
    public int minus(int num1, int num2) {
        return num1 - num2;


    }
    public int multiply(int num1, int num2) {
        return num1 * num2;


    }
    public int divide(int num1, int num2) {
        return num1 / num2;


    }


}

