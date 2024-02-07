package org.example;
import java.util.Scanner;
public class MeaningApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }
        double sumOfPositives = 0;
        int countOfPositives = 0;
        for (double num : numbers) {
            if (num > 0) {
                sumOfPositives += num;
                countOfPositives++;
            }
        }
        if (countOfPositives > 0) {
            double meanOfPositives = sumOfPositives / countOfPositives;
            System.out.printf("%.2f\n", meanOfPositives);
        } else {
            System.out.println("Not Found");
        }
    }
}