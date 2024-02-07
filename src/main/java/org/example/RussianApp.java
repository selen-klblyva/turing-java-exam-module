package org.example;

import java.util.Scanner;
public class RussianApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        scanner.close();

        long N = calculateBirthday(S);
        System.out.println(N);
    }

    public static long calculateBirthday(long S) {
        long totalMoney = 0;
        long years = 0;

        while (totalMoney < S) {
            years++;
            totalMoney += (1 << years) + years; // Doubling the previous gift and adding the age
        }

        return years;
    }
}
