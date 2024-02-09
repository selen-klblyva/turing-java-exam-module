package org.example;

import java.util.Scanner;

/* public class SumAndAmountApp {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int[] arr=new int[n];
       int sum=0;
       int amount=0;
       int i;
       for(i=0;i<arr.length;i++){
           arr[i]=scanner.nextInt();
       }
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
            amount++;
        }
        System.out.printf("%d %d",amount,sum);

    }

}

 */

public class SumAndAmountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input sequence
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int sum = 0;
        int count = numbers.length;

        // Calculate sum of integers
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        // Print the amount and sum
        System.out.println("Amount: " + count);
        System.out.println("Sum: " + sum);
    }
}














