package org.example;
import java.util.Scanner;
public class RatioApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double sum=0;
        double product=1;
        while(n>0){
            int digit=n%10;
             n/=10;
             sum+=digit;
             product*=digit;
        }
        System.out.printf("%.3f",product/sum);

    }
}
