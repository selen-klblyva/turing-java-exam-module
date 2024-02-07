 package az.edu.turing;

 import java.util.Scanner;
 public class DivisibleByApp {
     public static void main(String[] args){
         Scanner scanner=new Scanner(System.in);
         int n=scanner.nextInt();
         long[] arr=new long[n];
         int sum=0;
         int count=0;
         for(int i=0;i<arr.length;i++) {
             arr[i] = scanner.nextLong();
         }
         for(int i=0;i<arr.length;i++) {
             if(arr[i]%6==0){
                 count++;
                 sum+=arr[i];
             }
         }
         System.out.printf("%d %d",count,sum);
     }

 }