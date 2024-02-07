package org.example;

import java.util.Scanner;

public class SumAndAmountApp {

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