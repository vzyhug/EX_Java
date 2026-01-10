import java.util.Scanner;
import java.time.LocalDate; // dd-MM-yyyy
import java.time.format.DateTimeFormatter;


public class bai1_11 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Nhap vao ngay sinh (dd/MM/yyyy): ");
        String dobInput = sc.nextLine();
        LocalDate date = LocalDate.parse(dobInput, dtf);
        System.out.println("Ngay sinh ban da nhap la: " + date.format(dtf));
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
    }
}
