package az.edu.turing;


import java.util.Scanner;
public class SquareApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextDouble();
        for(int i=1;i*i<=n;i++){
                System.out.print(i*i+" ");
            }
        }

    }
