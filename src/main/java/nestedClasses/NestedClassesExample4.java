package nestedClasses;
//пример анонимного класса, который реализован на основе интерфейса
//целевое решение созданное на базе интерфейса и класса,который реализовывает его
public class NestedClassesExample4 {
    public static void main(String[] args) {
        Pepperoni pizza = new Pepperoni();
        pizza.cooking();
        pizza.serving();


    }
}
class Pepperoni implements PepperoniInterface {


    @Override
    public void cooking() {
        System.out.println("Cooking process");

    }

    @Override
    public void serving() {
        System.out.println("Serving process");

    }
}

interface PepperoniInterface {

 void cooking();
 void serving();



}