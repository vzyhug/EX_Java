import java.util.Scanner;
import java.time.LocalDate; // dd-MM-yyyy
import java.time.format.DateTimeFormatter;
public class bai1_11 {
    public static boolean checkDate(int day, int month, int year) {
        try {
            LocalDate date = LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void pre_aftDays(int day , int month , int year){
        if(checkDate(day, month, year)){
            LocalDate date = LocalDate.of(year, month, day);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate previousDate = date.minusDays(1);
            LocalDate nextDate = date.plusDays(1);
            System.out.println("Ngay truoc do : " + previousDate.format(formatter));
            System.out.println("Ngay sau do : " + nextDate.format(formatter));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay : ");
        int day = sc.nextInt();
        System.out.println("Nhap thang : ");
        int month = sc.nextInt();
        System.out.println("Nhap nam : ");
        int year = sc.nextInt();
        if(checkDate(day, month, year)) {
            System.out.println("Ngay vua nhap : " + String.format("%02d-%02d-%04d", day, month, year));
            pre_aftDays(day, month, year);
        } else {
            System.out.println("Ngay khong hop le");
        }
    }
}
