package az.edu.turing;
import java.util.Scanner;

/* public class ReverseApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long x=scanner.nextLong();
        System.out.println(reverseInt(x));
    }

    public static long reverseInt(long x){
        long reversed=0;
        while(x!=0) {
            long digit = x % 10;
            reversed=reversed*10+digit;
            x/=10;
        }
        return reversed;
    }

}

 */

public class ReverseApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        printReverse(n);
    }

    public static void printReverse(long n) {
        String reversed = new StringBuilder(Long.toString(n)).reverse().toString();
        System.out.println(reversed);
    }
}