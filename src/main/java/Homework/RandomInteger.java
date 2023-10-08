package Homework;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(899 + 100) ;
        int first = a / 100;
        int second = a / 10;
        int second1 = second % 10;
        int third = a % 10;
        if (first > second1 && first > third) {
            System.out.println (first);
        } else if (second1 > first && second1 > third) {
            System.out.println (second1);
        } else {
            System.out.println (third);
        }
        System.out.println (a);

        }
    }


//    

