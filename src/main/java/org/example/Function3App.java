package org.example;

import java.util.Scanner;

public class Function3App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double result = calculateFunction(x, y);
            System.out.printf("%.4f\n", result);
        }
        scanner.close();
    }

    public static double calculateFunction(double x, double y) {
        return Math.pow(x, 2) + Math.sin(x * y) - Math.pow(y, 2);
    }
}