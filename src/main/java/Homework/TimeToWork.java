package Homework;

public class TimeToWork {
    public static void main(String[] args) {

                 int secInMin = 60;
                 int minInHour = 60;
                 int fullTime = 28800;

                int sec = (int)(Math.random() * fullTime);
                int hour = (sec / secInMin) / minInHour;

                System.out.println(sec);

                if(hour == 0)
                    System.out.println("Осталось менее часа");
                else if(hour == 1)
                    System.out.println("Остался " + hour + " час");
                else if(hour >= 2 && hour <= 4)
                    System.out.println("Осталось " + hour + " часа");
                else
                    System.out.println("Осталось " + hour + " часов");
            }
        }