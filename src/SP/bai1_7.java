package SP;

import java.util.Scanner;
public class bai1_7 {
    static Scanner input = new Scanner(System.in);
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int typeOfMonth_31 = 31;
        int typeOfMonth_30 = 30;
        int typeOfMonth_28 = 28;
        int typeOfMonth_Leap = 29;
        System.out.println("Enter month (1-12): ");
        int month = input.nextInt();
        try {
            if (month < 1 || month > 12) {
                throw new Exception("Invalid month. Month must be between 1 and 12.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Month " + month + " has " + typeOfMonth_31 + " days.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Month " + month + " has " + typeOfMonth_30 + " days.");
                break;
            case 2:
                int yearOfFebruary;
                System.out.println("Enter year: ");
                yearOfFebruary = input.nextInt();
                if (isLeapYear(yearOfFebruary)){
                    System.out.println("Month " + month + " of year " + yearOfFebruary + " has " + typeOfMonth_Leap + " days.");
                } else {
                    System.out.println("Month " + month + " of year " + yearOfFebruary + " has " + typeOfMonth_28 + " days.");
                }
        }
    }
}
