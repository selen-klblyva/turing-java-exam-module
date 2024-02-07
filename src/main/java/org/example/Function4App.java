package org.example;
import java.util.Scanner;
public class Function4App {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long x=scanner.nextLong();
        long result1=function(x);
        System.out.println(result1);

    }

   public static long function(long x){
      return 1+x+(x*x);
    }
}
