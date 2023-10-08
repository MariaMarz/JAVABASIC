import java.sql.SQLOutput;

public class StringExamples {
    public static void main(String[] args) {
        // 1. литерал -> пулл констант String (String pool)
        String a = "hello";
        String b = "hello";

// .equaks ()  - сравнивает значения внутри String обьектов
        System.out.println("1. = " + a.equals(b));
        // == - сравнение для ссылочных типов
        System.out.println("1.== " + (a == b));

        // 2. new -> хранение переменных со своим адресом в куче (heap)

        String c = new String("java");
        String d = new String("java");

        System.out.println("2. = " + c.equals(d));
        System.out.println("2.== " + (c == d));


  //      int q = 10;
  //      int w = 10;

  //      System.out.println("int == "+ (q ==w));

        // длинна строки
        System.out.println(a.length());

        // посимвольная работа со строкой
        System.out.println(a.charAt(4));

        // срез строки
        System.out.println(a.substring(1));
        System.out.println(a.substring(1,3));

    }
}
