package loops;

public class DoWhileExample2 {
    public static void main(String[] args) {
        // пример работы do-while для печати
        // части элементов внутри массива
        int[]a = {14, 9,3,1,6,4,2};

        int q = 0;

        do {
            System.out.println(a[q]+ " ");
            q++;
        }  while (q<a.length);

    }
}
