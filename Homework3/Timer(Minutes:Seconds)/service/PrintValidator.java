public class PrintValidator {
    public static void minutesStyle(int currentMin) {
        if (currentMin < 10 && currentMin >= 0) {
            System.out.print("0" + currentMin + ":");
        } else {
            System.out.print(currentMin + ":");
        }
    }

    public static void secondsStyle(int currentSec) {
        if(currentSec < 10 && currentSec >= 0) {
            System.out.print("0" + currentSec);
        } else {
            System.out.print(currentSec);
        }
        System.out.println();
    }
}
