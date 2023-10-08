package Homework;

public class ColbaTemperature1 {
    public static void main(String[] args) {
        int Temperature1 = 120;
        int Temperature2 = 70;
        boolean q = (Temperature1 > 100) && (Temperature2 < 100);
        System.out.println(q);

        if ((Temperature1 > 100) && (Temperature2 < 100)) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }

    }
}
