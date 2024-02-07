package org.example;

import java.util.Scanner;

public class CoordinateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the coordinates of the point
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Determine the quadrant
        int quadrant;
        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0;
        }

        // Output the quadrant number
        System.out.println(quadrant);
    }
}