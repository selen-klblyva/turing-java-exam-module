package az.edu.turing;
import java.util.Scanner;
public class ValueOfVariableApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        float y=(float)((2*x/Math.sqrt(x*x+1))-(Math.sqrt(x*x+1)/Math.pow(x,3)));
        System.out.printf("%.3f",Math.abs(y));
    }
}
