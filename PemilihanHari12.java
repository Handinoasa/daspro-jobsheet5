import java.util.Scanner;
/**
 * PemilihanHari12
 */
public class PemilihanHari12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;
        System.out.println("Input day name : ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wedndesay":
            case "thrusday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                break;
        }
    }
}