import java.util.Scanner;

public class SwitchCaseExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls a day number of week: ");
        int dayOfWeek = scanner.nextInt();
        scanner.close();
        System.out.println(getDayOfWeekName1(dayOfWeek));
        System.out.println(getDayOfWeekName2(dayOfWeek));

    }

    // switch через : , break
    public static String getDayOfWeekName1(int d) {
        String result = "";

        switch (d) {
            case 1, 2, 3, 4, 5:
                result = "Working day";
                break;

            case 6, 7:
                result = "Weekend";
                break;

            default:
                result = "Wrong day";
        }

        return result;
    }

    // 2-ой пример switch через ->
    public static String getDayOfWeekName2(int d) {
        String result;
        switch (d) {
            case 1, 2, 3, 4, 5 -> result = "Working day";
            case 6, 7 -> result = "Weekend";
            default -> result = "Wrong day";
        }
        return result;
    }

    // switch как вырожение
    public static String getDayOfWeekName3(int d) {
        String result = switch (d) {
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Wrong day";
        };
        return result;
    }
// switch, который возвращается операторов return в методе
    public static String getDayOfWeekName4(int d) {
        return switch (d) {
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Wrong day";
        };

    }
}
