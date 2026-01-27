package OOP;

import java.util.Scanner;

public class DSDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diem2D A = new Diem2D(3,4);
        A.HienThi();
        Diem2D B = new Diem2D();
        B.NhapDiem();
        B.HienThi();
        Diem2D C = new Diem2D(-B.getX(),-B.getY());
        C.HienThi();
        System.out.println("BO = "+B.KhoangCachDenO());
        System.out.println("AB ="+A.KhoangCachDenDiem(B));
    }
}
