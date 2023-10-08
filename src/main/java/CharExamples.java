public class CharExamples {
    public static void main(String[] args) {
       // примитив         класс обертка
        // char            -> Character
        // byte            -> Byte
        // int              -> Integer
        // ...
        char q = 'y';
       char w = 216;
       char e = '\u03a3';



  //      System.out.println(q);
   //     System.out.println(w);
   //     System.out.println(e);

     //   System.out.println();

   //     System.out.println((int) q);
   //     System.out.println('y' *'y'); //приер из того что char . псевдоцелочисленное

        // Char to int
        // 1. ASCII table
        char r = 'y';
        System.out.println((int)r + " " + r) ;

        // 2. использлвание метода value0f() класса String
        char t = '8';
    //   int tint = Integer.parseInt(String.valueOf(t));
        int tint = Integer.parseInt(String.valueOf(t));
        System.out.println(tint);

        //3. использование метода getNumericVAlue() класса символов Character
        char y = '9';
        int yint = Character.getNumericValue(y);
        System.out.println(yint);




    }
}
