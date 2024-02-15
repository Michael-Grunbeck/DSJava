//Michael Grunbeck

// Import packages
import java.time.LocalDate;
import java.time.LocalTime;

public class PartA {
    public static void main(String[] args) {
        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Get current time
        LocalTime currentTime = LocalTime.now();

        // Display current date and time
        System.out.println("Today's date is " + currentDate);
        System.out.println("The time is " + currentTime);
    }
}