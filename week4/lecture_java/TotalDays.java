/*
 * Read month and date from STDIN
 * Calculate and show the total days from beginning of the year until the date
 * 
 * NOTE: Assume there is no leap year
 */

import java.util.Scanner;

public class TotalDays {
    public static Scanner in = new Scanner(System.in);
    public static int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        boolean flag = false;
        int day = 0;
        int month = 0;

        while (flag == false) {
            System.out.print("Day: ");
            day = in.nextInt();
    
            System.out.print("Month: ");
            month = in.nextInt();

            if (day > days[month-1]) {
                System.out.println("Invalid date for the selected month.");
                flag = false;
            } else {
                flag = true;
            }
        }

        int total = 0;
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }
        total += day;

        System.out.println("Total days = "+total);
    }
}
