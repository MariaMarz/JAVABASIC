public class SwitchCaseExample3 {
    public static void main(String[] args) {
        String dayOfWeek = "FR";

        String result = switch (dayOfWeek) {

            case "MO","TU","WE","TH","FR"-> "Working day";
            case "SA", "SU"-> "Weekend";
            default-> "This day is wrong";
        };
        System.out.println(result);
    }
}
