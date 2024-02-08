package az.edu.turing;

import java.util.Scanner;

public class Function2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double result = calculateFunction(x);
            System.out.printf("%.4f\n", result);
        }
        scanner.close();
    }

    public static double calculateFunction(double x) {
        return x + 2 * x + Math.sin(x);
    }
}
