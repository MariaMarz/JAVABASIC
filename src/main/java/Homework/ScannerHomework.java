package Homework;

import java.util.Scanner;

public class ScannerHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls integer number ");
        int m = scanner.nextInt();

        int a1 = m / 3;
        int a1_ = m % 3;

        int a2 = a1 / 3;
        int a2_ = a1 % 3;

        int a3 = a2 / 3;
        int a3_ = a2 % 3;

        System.out.println(a3_ + " " + a2_ + " " + a1_ + " ");

        scanner.close();
    }
}
