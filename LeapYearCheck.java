import java.util.Scanner;
public class LeapYearCheck {
    // Create a method to check if a year is a leap year
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Give the user a prompt to enter a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // The year is a leap year if it is divisible by 4, but not by 100, unless
        boolean isLeapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        // Print out whether the year is a leap year or not
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
