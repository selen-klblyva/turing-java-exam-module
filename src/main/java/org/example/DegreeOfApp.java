package org.example;

import java.util.Scanner;

public class DegreeOfApp
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        if (isPowerOfTwo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean isPowerOfTwo(long n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}