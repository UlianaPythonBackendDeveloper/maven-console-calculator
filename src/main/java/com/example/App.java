package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(); // Подключаем наш класс
        
        System.out.println("--- Консольный калькулятор ---");

        while (true) {
            System.out.print("\nВведите первое число (или 'exit' для выхода): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы. Пока!");
                break;
            }

            double num1;
            try {
                num1 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: это не число. Попробуйте еще раз.");
                continue;
            }

            System.out.print("Введите оператор (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: это не число.");
                scanner.next(); 
                continue;
            }
            double num2 = scanner.nextDouble();

            try {
                // Вызываем логику, которую покрыли тестами
                double result = calculator.calculate(num1, num2, operator);
                System.out.printf("Результат: %.2f\n", result);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
