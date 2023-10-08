package SummeryLessons;

import SummeryLessons.Cat;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Barsik", "mainkun", "white",4, true);

        System.out.println(cat1);

        cat1.name = "Murzik";
        cat1.breed = "brit";
        cat1.color = "grey";
        cat1.age = 2;
        cat1.isHungry = false;




        System.out.println(cat1.name);

       cat1.voice("Our cat say:");

        System.out.println(cat2.name);

    }
}
