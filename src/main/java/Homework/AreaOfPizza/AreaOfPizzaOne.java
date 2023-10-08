package Homework.AreaOfPizza;

import java.sql.SQLOutput;

public class AreaOfPizzaOne {
    double result1, result2, result3;
    public AreaOfPizzaOne (double d) {
        pow (d);     //      double result1 = pow;
        mult();              //      double result2 = mult;
        div();               //      double result3 = div;
        printResult();

    }
    private void pow (double d){
        result1 = Math.pow(d, 2);
    }
    private void mult() {
        result2 = Math.PI * 4;
    }
    private void div() {
        result3 = result1 / result2;
    }
    public void printResult() {
        System.out.println("Area of pizza = "+ result3);
    }
}
