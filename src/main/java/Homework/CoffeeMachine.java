package Homework;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите напиток: 1 - эспрессо, 2- американо, 3- капучинно, 4- вода");
        int valueDrink = sc.nextInt();

        getDrinkIf(valueDrink);
        System.out.println();
        getDrinkSwitch(valueDrink);

        sc.close();
    }


    public static String getDrinkIf(int a) {
        String nameDrink;
        if (a == 1) {
            nameDrink = "Эспрессо";
        } else if (a == 2) {
            nameDrink = "Американо";
        } else if (a == 3) {
            nameDrink = "Капучинно";
        } else if (a == 4) {
            nameDrink = "Вода";
        } else {
            nameDrink = "Ошибка!";
            System.out.println(nameDrink);
            return nameDrink;
        }
        System.out.println("Ваш " + nameDrink + " готов");
        return nameDrink;
    }

        public static void getDrinkSwitch(int n) {
            String nameDrink;
            switch (n) {
                case 1:
                    nameDrink = "Эспрессо";
                    break;
                case 2:
                    nameDrink = "Американо";
                    break;
                case 3:
                    nameDrink = "Капучинно";
                    break;
                case 4:
                    nameDrink = "Вода";
                    break;

                default:
                    nameDrink = "Ошибка!";
                    System.out.println(nameDrink);
                    return;
            }
            System.out.println("Ваш "+  nameDrink + " готов");
        }

    }






