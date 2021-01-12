package DaysOfTheWeek;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] arg) {
        boolean choice = true;
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7 : ");
        while (choice == true) {
            int pickedNumber = scanner.nextInt();
            if (pickedNumber <= 0) {
                System.out.println("Number too low, pick a number between 1 to 7");
            } else if (pickedNumber <= 7) {
                System.out.println("Today is " + weekDays[pickedNumber - 1]);
                choice = false;
            } else {
                System.out.println("Number too high, pick a number between 1 to 7");
            }

        }
    }
}