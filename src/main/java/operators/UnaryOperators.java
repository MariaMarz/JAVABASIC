package operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        // 00000000 00000000 00000000 00001010
        // 11111111 11111111 11111111 11110101
        // 11111111 11111111 11111111 11110101
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(~a));



    }

    public static void incrementPrefix() {
        // инкремент
        int a = 5;
        System.out.println(a);
        ++a; // a = a + 1; // сначалоо происходит операция сложкеия ,позде операция обращения к переменной
        System.out.println(a);
    }

    public static void incrementPostfix() {
        // инкремент
        int a = 5;
        System.out.println(a);
        a--; // a = a - 1; // сначалоо происходит операция сложкеия ,позде операция обращения к переменной
        System.out.println(a);
    }
    public static void decrementPrefix() {
        // декремент
        int b = 4;
        System.out.println(b);
        --b; // b = b - 1
        System.out.println(b);
    }
    public static void decrementPostfix() {
        // декремент
        int b = 4;
        System.out.println(b);
        b--; // b = b - 1
        System.out.println(b);
    }
}


