package org.example;

import java.util.Scanner;
public class Function5App {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long x=scanner.nextLong();
        long y=scanner.nextLong();
        long z=scanner.nextLong();
        long result1=function(x,y,z);
        System.out.println(result1);

    }

    public static long function(long x,long y,long z){
        return x*y*z+x+y*y+z*z*z;
    }
}

