package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            int result = 0;
            String output = "";

            switch (command) {
                case "add":
                    result = calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    System.out.println(result);
                    break;
                case "subtract":
                    result = calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    System.out.println(result);
                    break;
                case "multiply":
                    result = calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    System.out.println(result);
                    break;
                case "divide":
                    result = calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    System.out.println(result);
                    break;
                case "fibonacci":
                    result = calculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
                    System.out.println(result);
                    break;
                case "binary":
                    output = calculator.intToBinaryNumber(Integer.parseInt(parts[1]));
                    System.out.println(output);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }

        scanner.close();
    }
}
