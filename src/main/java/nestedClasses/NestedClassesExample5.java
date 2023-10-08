package nestedClasses;
//пример анонимного класса, который реализован на основе интерфейса
public class NestedClassesExample5 {
    public static void main(String[] args) {


        PepperoniInterface1 pizza = new PepperoniInterface1() {
            @Override
            public void cooking() {
                System.out.println("Cooking process via Anon object");

            }

            @Override
            public void serving() {
                System.out.println("Serving process via Anon object");

            }
        };
pizza.cooking();
pizza.serving();

    }
}
interface PepperoniInterface1 {

    void cooking();
    void serving();


}