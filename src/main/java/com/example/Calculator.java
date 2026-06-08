package com.example;

public class Calculator {
    public double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+': 
                return num1 + num2;
            case '-': 
                return num1 - num2;
            case '*': 
                return num1 * num2;
            case '/': 
                if (num2 == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return num1 / num2;
            default: 
                throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
    }
}
