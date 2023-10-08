package nestedClasses;
//пример анонимного класса, который реализован на основе класса наследника
public class NestedClassesExample6 {
    public static void main(String[] args) {
        Pepperoni2 pizza = new Pepperoni2(){
            @Override
            public void cooking() {
                System.out.println("Cooking process §2 via Anon object");
            }

            @Override
            public void serving() {
                System.out.println("Serving process §2 via Anon object");
            }
        };
        pizza.cooking();
        pizza.serving();

    }
}


class Pepperoni2 {
    public void cooking () {
        System.out.println("Cooking process §2");
    }

    public void serving () {
        System.out.println("Serving process §2");
    }
}