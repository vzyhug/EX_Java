package SP;

import java.util.Scanner;
public class bai1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum =0;
        boolean flagStop = false;
        do {
            System.out.println("Nhap so thuc khac 0 :  ");
            double n = sc.nextDouble();
            if(n == 0){
                System.out.println("Da dung chuong trinh");
                break;
            }
            sum += n;
            System.out.println("Tong cac so vua nhap la: " + sum);
        }while (true);
    }
}
