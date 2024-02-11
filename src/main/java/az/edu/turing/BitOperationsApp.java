package az.edu.turing;
import java.util.Scanner;
public class BitOperationsApp {
    public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       int k=scanner.nextInt();
       int n=scanner.nextInt();
       int result=(1<<k)+(1<<n);
        System.out.println(result);
    }
}
