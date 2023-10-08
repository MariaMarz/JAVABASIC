package Homework;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количесвто этажей в доме(H) : ");
        int floorsValue = sc.nextInt();

        System.out.println("Введите номер этажа, при подъеме на вверх(N): ");
        int liftUp = sc.nextInt();

        System.out.println("Введите номер этажа, при спуске вниз(M): ");
        int liftDown = sc.nextInt();

        System.out.println("H = " + floorsValue + ", N = " + liftUp + ", M = " + liftDown);

        getCurrentFloor(floorsValue,liftUp,liftDown);
        sc.close();
    }

    public static int getCurrentFloor(int h, int n, int m) {
        if (h <= 1 || n <= m || n <= 1 || m < 0) {
            System.out.println("Ошибка!");
            return 0;
        }

        int currentFloor = 1;
        for (int i = 1; i < h; i ++) {
            if (h <= (i + n)) {
                System.out.println("value of lift UP => " + currentFloor);
                return currentFloor;

            }
            currentFloor++;

        }
        System.out.println("value of lift UP => " + currentFloor);
        return currentFloor;
    }
}
