import java.util.Random;

public class RandomExamples {
    public static void main(String[] args) {
        // [1;14) - 1,2,3
        // (0;5] - 1,2,3,4

        // 1й способ создания псевдослучайных чисел
        Random random = new Random();
        random.setSeed(10L);

        double rD = random.nextDouble(); // [0;1)
      System.out.println(rD);

        int rI1 =random.nextInt(1, 5); //-> [1;5)]
        int rI2 = random.nextInt(10); // ->
        System.out.println(rI1);
        System.out.println(rI2);

        System.out.println(random.nextInt(7, 10)); // -> [7;10)

        System.out.println();

// 2 sposob, Math.random
        double m = Math.random(); // -> [0;1)
        int q = (int) (Math.random() * 10); // -> [0;10)
        int w = (int) (Math.random() *8 + 2);// [2;10)
        System.out.println(w);

// [x;y), x<y =>
        // Math.random() * (y-x) + x
    }
}
