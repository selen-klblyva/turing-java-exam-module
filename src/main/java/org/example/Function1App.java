package org.example;

import java.util.Scanner;

public class Function1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();
            double result = calculateFunction(x);
            System.out.printf("%.4f\n", result);

    }

    public static double calculateFunction(double x) {
        return Math.pow(x, 3) + 2 * Math.pow(x, 2) - 3;
    }
}