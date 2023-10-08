package Homework;

public class Four {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        Four four = new Four();
        four.rotate(a,b);
    }
    public void rotate(int a, int b) {
        int c = a;
        a = b;
        b = c;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

    }
}
