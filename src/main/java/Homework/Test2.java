package Homework;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls text");
        String text = scanner.nextLine();
        int count = 0;
        if (text.length()!= 0) {
            count++;

            for (int i = 0; i <text.length() ; i++) {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("You wrote " + count + "words");
    }
}
