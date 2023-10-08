package SummeryLessons;

public class Cat {
    String name;
    String breed;
    String color;
    int age;
    boolean isHungry;

    public Cat (){

    }


    public Cat(String name, String breed, String color, int age, boolean isHungry){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;

    }



    public void voice(String message) {
        System.out.println(message);
        System.out.println("MEOW!" + name);
    }

    public void sleep() {
        System.out.println();
    }

}
