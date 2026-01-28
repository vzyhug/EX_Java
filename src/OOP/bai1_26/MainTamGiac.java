package OOP.bai1_26;
import OOP.bai1_24.Diem2D;

import java.util.Scanner;

public class MainTamGiac {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("tao tam giac !");
        Diem2D A = new Diem2D(1, 2);
        Diem2D B = new Diem2D(4, 4);
        Diem2D C = new Diem2D(3, 9);
        TamGiac d = new TamGiac(A, B, C);
        d.Xuat();
        System.out.println("chu vi tam giac : " + d.TinhChuVi());
        System.out.println("Dien tich tam giac : " + d.TinhDienTich());

        // kịch bản 1 : góc giữa các vector AB , AC
        double xAB = B.getX()-A.getX();
        double yAB = B.getY()-A.getY();
        double xAC = C.getX()-A.getX();
        double yAC = C.getY()-A.getY();
        // tich vo huong
        double tvh = xAB*xAC  + yAB*yAC;
        // tich do dai
        double dAB = Math.sqrt(Math.pow(xAB,2)+Math.pow(yAB,2));
        double dAC = Math.sqrt(Math.pow(xAC,2)+Math.pow(yAC,2));
        double tdd = tvh*dAB;
        //
        double goc = tdd/tdd;
        System.out.println("goc giua hai vector AB , AC: "+ goc);
    }
}