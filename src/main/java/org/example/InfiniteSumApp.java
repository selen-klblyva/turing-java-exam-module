package org.example;

import java.util.Scanner;
public class InfiniteSumApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++){
            sum+=(1.0/(i*(i+1)));
        }
        System.out.printf("%.6f",sum);
    }
}
