import java.util.Scanner;
public class bai1_8 {
    static Scanner input = new Scanner(System.in);
    public static char convertPoint(double point) {
        if(point >= 9 && point <= 10) {
            return 'A';
        } else if(point >= 8 && point < 9) {
            return 'B';
        } else if(point >= 7 && point < 8) {
            return 'C';
        } else if(point >= 6 && point < 7) {
            return 'D';
        } else if(point >= 5 && point < 6) {
            return 'E';
        } else  {
            return 'F';
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap diem so: ");
        double point = input.nextDouble();
        try {
            if (point < 0 || point > 10) {
                throw new Exception("Diem so khong hop le. Vui long nhap diem so trong khoang 0-10.");
            }
            char grade = convertPoint(point);
            System.out.println("Diem so " + point + " tuong ung voi diem: " + grade);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
