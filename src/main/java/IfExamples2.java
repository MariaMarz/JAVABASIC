public class IfExamples2 {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        System.out.print("Classic if: ");
        String resultClassic = "";
        if (dayOfWeek <= 5 && dayOfWeek > 0)
            resultClassic = "Working day";
        else if (dayOfWeek <=7)
            resultClassic = "Weekend";
        else
            resultClassic = "Wrong day";
        System.out.println(resultClassic);

        System.out.print("Ternary if: ");
        String resultTernary = dayOfWeek <= 5 &&dayOfWeek> 0 ?
                "Working day" : (dayOfWeek <=7 && dayOfWeek >5)? "Weekend": "Wrong day";
        System.out.println(resultTernary);
    }
}
