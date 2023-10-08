public class SwitchCaseExample2 {
    //пример switch case как оператор
    public static void main(String[] args) {
        String dayOfWeek = "MO";

       String result = switch (dayOfWeek) {

            case "MO"-> "Monday";
            case "TU"-> "Tuesday";
            case "WE"-> "Wednesday";
            case "TH"-> "Thursday";
            case "FR"-> "Friday";
            case "SA"-> "Saturday";
            case "SU"-> "Sunday";
            default-> "This day is wrong";
        };
        System.out.println(result);



    }
}
