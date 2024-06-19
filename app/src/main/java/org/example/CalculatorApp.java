package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalculatorApp {

    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorServiceImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");

        int choice = scanner.nextInt();
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        int result = 0;
        switch (choice) {
            case 1:
                result = calculator.add(a, b);
                break;
            case 2:
                result = calculator.subtract(a, b);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
