package org.example;

import java.util.Scanner;

public class ValueOfVariableApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        double result =findValue(x);
        System.out.printf("%.3f",result);
    }
    private static double findValue(int x) {
        return Math.sqrt(Math.pow(x,4)+1)/Math.pow(x,2)-Math.sqrt(Math.pow(x,2)/(Math.pow(x,2)+1));
    }
}
