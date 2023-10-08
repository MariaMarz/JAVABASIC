package Homework;

public class ArrayRandom15 {
    public static void main(String[] args) {
        int [] a = new int[15];
        int b;
        b = 0;
        for (int i = 0; i <a.length ; i++) {
            a[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2==0) {
                b++;
            }
            System.out.println(a[i]+ " ");
        }
        System.out.println();
        System.out.println(b);
    }
}
