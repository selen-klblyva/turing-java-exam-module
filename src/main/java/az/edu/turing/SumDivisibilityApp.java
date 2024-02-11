package az.edu.turing;

import java.util.Scanner;
public class SumDivisibilityApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = findMinimumN(k);
        System.out.println(n);
    }

    public static int findMinimumN(int k) {
        long sum = 0;
        int n = 0;
        while (true) {
            n++;
            sum += n;
            if (sum % k == 0) {
                return n;
            }
        }
    }
}