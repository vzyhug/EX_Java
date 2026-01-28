package OOP;
import java.util.Scanner;

public class MonTh extends MonHoc{
    double kt1;
    double kt2;
    double kt3;
    double kt4;

    public double getKt1() {
        return kt1;
    }

    public void setKt1(double kt1) {
        this.kt1 = kt1;
    }

    public double getKt2() {
        return kt2;
    }

    public void setKt2(double kt2) {
        this.kt2 = kt2;
    }

    public double getKt3() {
        return kt3;
    }

    public void setKt3(double kt3) {
        this.kt3 = kt3;
    }

    public double getKt4() {
        return kt4;
    }

    public void setKt4(double kt4) {
        this.kt4 = kt4;
    }

    public MonTh() {
    }

    public MonTh(String maMon, String tenMon, int soTinChi, double kt1, double kt2, double kt3, double kt4) {
        super(maMon, tenMon, soTinChi);
        this.kt1 = kt1;
        this.kt2 = kt2;
        this.kt3 = kt3;
        this.kt4 = kt4;
    }

    public MonTh(double kt1, double kt2, double kt3, double kt4) {
        this.kt1 = kt1;
        this.kt2 = kt2;
        this.kt3 = kt3;
        this.kt4 = kt4;
    }

    @Override
    void Nhap() {
        super.Nhap();
        System.out.println("Nhap diem kiem tra 1: ");
        kt1 =sc.nextDouble();
        System.out.println("Nhap diem kiem tra 2: ");
        kt2 =sc.nextDouble();
        System.out.println("Nhap diem kiem tra 3: ");
        kt3 =sc.nextDouble();
        System.out.println("Nhap diem kiem tra 4: ");
        kt4 =sc.nextDouble();
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println("diem kiem tra 1: "+ kt1);
        System.out.println("diem kiem tra 2: "+ kt2);
        System.out.println("diem kiem tra 3: "+ kt3);
        System.out.println("diem kiem tra 4: "+ kt4);
        System.out.println("Diem TB: "+ DTB());
    }

    @Override
    double DTB() {
        return (getKt1() + getKt2() + getKt3() + getKt4()) / 4;
    }
}
