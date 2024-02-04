import java.util.Scanner;

public class LastDigitApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result =findlastDigit(n);
        System.out.println(result);
    }
    private static int findlastDigit(int n) {
        return n%10;
    }
}
