public class HomeWorkNumericalSystems {
    public static void main(String[] args) {
      // DECIMAL <=> OCTAL // 1144; 978; 12
        int a = 1144;
        int a8 = 2170;

        System.out.println(2*Math.pow(8,3)+ 1* Math.pow(8,2)+ 7* Math.pow(8,1)+ 0*Math.pow(8,0));

        System.out.println(1144/8); // 143
        System.out.println(1144%8); // 0

        System.out.println(143/8); // 17
        System.out.println(143%8); // 7

        System.out.println(17/8); // 2
        System.out.println(17%8); // 1

        System.out.println(2/8); // 0
        System.out.println(2%8); // 2

        System.out.println(a8);


        System.out.println();

        int b = 978;
        int b8 = 1722;

        System.out.println(1*Math.pow(8,3)+ 7*Math.pow(8,2)+ 2*Math.pow(8,1)+2*Math.pow(8,0));

        System.out.println(978/8); // 122
        System.out.println(978%8); // 2

        System.out.println(122/8); // 15
        System.out.println(122%8); // 2

        System.out.println(15/8); // 1
        System.out.println(15%8); // 7

        System.out.println(1/8); // 0
        System.out.println(1%8); // 1

        System.out.println(b8);

        System.out.println();

        int c = 12;
        int c8 = 14;

        System.out.println(1*Math.pow(8,1)+4*Math.pow(8,0));

        System.out.println(12/8); // 1
        System.out.println(12%8); // 4

        System.out.println(1/8); // 0
        System.out.println(1%8); // 1

        System.out.println(c8);

        System.out.println();


    }
}
