package org.example;

import java.util.Scanner;
public class SimpleFunctionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.close();

        double result = calculateFunction(x);

        // Printing the result with 4 decimal digits
        System.out.printf("%.4f\n", result);
    }

    public static double calculateFunction(double x) {
        return x + Math.sin(x);
    }
}