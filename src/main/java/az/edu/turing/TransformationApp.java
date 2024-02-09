package az.edu.turing;

import java.util.Scanner;

public class TransformationApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int changes = getChangesToOne(n);
        System.out.println(changes);
    }

    public static int getChangesToOne(int n) {
        int changes = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n += 1;
            }
            changes++;
        }
        return changes;
    }
}