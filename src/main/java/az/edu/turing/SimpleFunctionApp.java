package az.edu.turing;

import java.util.Scanner;

public class SimpleFunctionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the value of x from the user
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        // Call the function and print the result with 4 decimal digits
        double result = evaluateFunction(x);
        System.out.printf("f(x) = %.4f\n", result);

        scanner.close();
    }

    // Function to evaluate f(x) = x + sin(x)
    private static double evaluateFunction(double x) {
        return x + Math.sin(x);
    }
}