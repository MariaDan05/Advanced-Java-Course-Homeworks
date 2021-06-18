import java.util.Scanner;

public class TimerService {
    public static void createTimer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int currentMin = scanner.nextInt();
        System.out.println("Enter seconds: ");
        int currentSec = scanner.nextInt();
        Thread t = new Thread(new MyRunnable(currentMin, currentSec));
        System.out.println("Timer:");
        t.start();
    }
}
