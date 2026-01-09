import java.util.Scanner;
public class bai1_10 {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0||(year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkYear(String date) {
       if(date.length() != 8) {
           return false;
       }
       String yearString = date.substring(4,8);
       int year = Integer.parseInt(yearString);
       if(year<0){
              return false;
       }
       return true;
    }
    public static boolean checkMonth(String date) {
        if(date.length() != 8) {
            return false;
        }
        String monthString = date.substring(2,4);
        int month = Integer.parseInt(monthString);
        if(month<1 || month>12){
               return false;
        }
        return true;
    }
    public static boolean checkDay(String date) {
        if(date.length() != 8) {
            return false;
        }
        String dayString = date.substring(0,2);
        String monthString = date.substring(2,4);
        String yearString = date.substring(4,8);
        int day = Integer.parseInt(dayString);
        int month = Integer.parseInt(monthString);
        int year = Integer.parseInt(yearString);
        if(isLeapYear(year)){
            if(month == 2){
                if(day>=1 && day<=29){
                    return true;
                }
            }
        }
        else if(month == 2){
            if(day>=1 && day<=28){
                return true;
            }
        }
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8||month == 10||month == 12){
            if(day>=1 && day<=31){
                return true;
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day>=1 && day<=30){
                return true;
            }
        }
        return false;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter day : ");
        String date = sc.nextLine();
        String dateConvert = date.replace("/","");
        if(checkDay(dateConvert) && checkMonth(dateConvert) && checkYear(dateConvert)){
            System.out.println("Date is valid");
        } else {
            System.out.println("Date is invalid");
        }
    }
}
