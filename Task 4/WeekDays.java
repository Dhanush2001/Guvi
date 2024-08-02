import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args)
    {
        String[] daysOfWeek = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day (0-6): ");
        int dayPosition = scanner.nextInt();
        try
        {
            String dayName = daysOfWeek[dayPosition];
            System.out.println("The day at position " + dayPosition + " is " + dayName + ".");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: The index " + dayPosition + " is out of bound. Please enter a number between 0 and 6.");
        }

    }
}
