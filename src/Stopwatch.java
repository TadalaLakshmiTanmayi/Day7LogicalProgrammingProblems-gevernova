//Program 6
import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press Enter to Start the Stopwatch.");
        sc.nextLine();  // Wait for the user to press Enter to start

        long startTime = System.currentTimeMillis();  // Capture the start time

        System.out.println("Stopwatch started. Press Enter to Stop the Stopwatch.");
        sc.nextLine();  // Wait for the user to press Enter to stop

        long endTime = System.currentTimeMillis();  // Capture the end time

        long elapsedTime = endTime - startTime;  // Calculate elapsed time in milliseconds

        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");

        sc.close();
    }
}
