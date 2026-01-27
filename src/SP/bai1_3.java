package SP;

import java.util.Scanner;
public class bai1_3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = (a > b) ? a : b;
        System.out.println("So lon hon : "+ max);
        // nhap so tu ban phim
        System.out.println("Nhap so a: ");
        int a1 = input.nextInt();
        System.out.println("Nhap so b: ");
        int b1 = input.nextInt();
        int max1 = (a1 > b1) ? a1 : b1;
        System.out.println("So lon hon : "+ max1);
    }
}