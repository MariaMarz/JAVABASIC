package loops;

import java.util.Scanner;

public class WhileExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводите целые числа, которые хотелось бы просумировать: ");
        int sum = 0;

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            sum = sum + a;
            System.out.println("Промежуточная сумма = "+ sum);
        }
        System.out.println("Сумма введенных значений = " + sum);

        scanner.close();

    }
}
