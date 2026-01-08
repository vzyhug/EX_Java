import java.util.Scanner;
public class bai1_4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap a: ");
        int a = input.nextInt();
        System.out.println("Nhap b: ");
        int b = input.nextInt();
        System.out.println("Nhap c: ");
        int c = input.nextInt();
        // tim max
        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println("So lon nhat : "+ max);
        // tim min
        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        System.out.println("So nho nhat : "+ min);
    }
}
