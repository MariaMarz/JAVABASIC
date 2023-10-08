public class SigmoidTwo {
    // sigmoid = 1 / (1 + e^(-x))


    public SigmoidTwo(double input) {
  //      double result1 = neg(input);
  //      double result2 = pow (result1);
  //      double result3 = sum(result2);
  //      double result4 = div(result3);

        double result4 = div(sum(pow(neg(input))));

        System.out.println("Result2 is = "+ result4);
    }

    private double neg(double x) {return  x * (-1); }
      private double pow(double q){return  Math.pow(Math.E, q ); }
private double sum(double w) {return  1 + w; }
private double div(double e) {return  1 / e; }

private void printResult(double result4) {

        System.out.println("Result is = " + result4);

    }
}