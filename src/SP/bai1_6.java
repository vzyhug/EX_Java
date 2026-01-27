package SP;

import java.util.Scanner;
public class bai1_6 {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao nam: ");
        int year = inp.nextInt();
        boolean isLeap = false;
        if (year % 400 == 0 || (year%4 == 0 && year % 100 != 0)) {
            isLeap = true;
        }
        else {
            isLeap = false;
        }
        switch (isLeap ? 2 : 1) {
            case 1: System.out.println(year + " la nam khong nhuan"); break;
            case 2: System.out.println(year + " la nam nhuan"); break;
        }
    }
}
