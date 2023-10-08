package Homework;

import java.util.Arrays;

public class Test {
    public static void main(String args[]) {

        int[] a = new int[8]; // 8 чисел

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1; // [1;10]
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 1) {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

