import java.util.Scanner;
import java.lang.Math;
public class bai1_5 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // pt bac 2: ax^2 + bx + c = 0
        System.out.println("Nhap a: ");
        double a = input.nextDouble();
        System.out.println("Nhap b: ");
        double b = input.nextDouble();
        System.out.println("Nhap c: ");
        double c = input.nextDouble();
        // tinh delta
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2*a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
