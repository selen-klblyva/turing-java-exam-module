package az.edu.turing;


import java.util.Scanner;
public class PowApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int n=scanner.nextInt();
        int result=(int)Math.pow(a,n);
        System.out.println(result);

    }
}