import com.auto.germany.Car;

public class FirstExample {
    public static void main(String[] args) {
        Car a = new Car();
        System.out.println(a.weight);
        System.out.println(a.year);
        System.out.println(a.model);
        System.out.println(Car.yearOfBirth);

        System.out.println();


        Car aNew = new Car();
        aNew.year = 2023;

        Car.yearOfBirth = 1760;

        System.out.println(aNew.weight);
        System.out.println(aNew.year);
        System.out.println(aNew.model);
        System.out.println(Car.yearOfBirth);
        System.out.println();
        // Finland.Cars
        com.auto.finland.Car finCar1 =
                new com.auto.finland.Car(1200, 2003, "lancer");

        System.out.println();
        com.auto.finland.Car finCar2 = new com.auto.finland.Car(1100, 2010); //CVD+p
        System.out.println();

        com.auto.finland.Car finCar3 =
                new com.auto.finland.Car(1250);
        System.out.println();

        com.auto.finland.Car finCar4 =
                new com.auto.finland.Car();
    }
}
