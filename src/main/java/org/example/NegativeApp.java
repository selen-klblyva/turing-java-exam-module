package org.example;
import java.util.Scanner;
/* public class NegativeApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double[] arr=new double[n];
        int i;
        double sum=0;
        int count=0;
        for(i=0;i<n;i++) {
            arr[i] = scanner.nextDouble();
        }
        for(i=0;i<n;i++) {
            if (arr[i] < 0) {
                sum += arr[i];
                count++;

            }
        }
        System.out.printf("%d %.2f",count,sum);
    }

}

 */

public class NegativeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] sequence = new double[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextDouble();
        }
        double sumOfNegatives = 0;
        int countOfNegatives = 0;
        for (double num : sequence) {
            if (num < 0) {
                sumOfNegatives += num;
                countOfNegatives++;
            }
        }
        System.out.printf("%d %.2f\n", countOfNegatives, sumOfNegatives);
    }
}

























