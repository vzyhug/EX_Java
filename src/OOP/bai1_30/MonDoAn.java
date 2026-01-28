package OOP.bai1_30;
import java.util.Scanner;

public class MonDoAn extends MonHoc{
    double diemGVHD;
    double diemPhanBien;
    final Scanner sc = new Scanner(System.in);

    public double getDiemGVHD() {
        return diemGVHD;
    }

    public void setDiemGVHD(double diemGVHD) {
        this.diemGVHD = diemGVHD;
    }

    public double getDiemPhanBien() {
        return diemPhanBien;
    }

    public void setDiemPhanBien(double diemPhanBien) {
        this.diemPhanBien = diemPhanBien;
    }

    public MonDoAn() {
    }

    public MonDoAn(String maMon, String tenMon, int soTinChi, double diemGVHD, double diemPhanBien) {
        super(maMon, tenMon, soTinChi);
        this.diemGVHD = diemGVHD;
        this.diemPhanBien = diemPhanBien;
    }

    public MonDoAn(double diemGVHD, double diemPhanBien) {
        this.diemGVHD = diemGVHD;
        this.diemPhanBien = diemPhanBien;
    }

    @Override
    void Nhap() {
        super.Nhap();
        System.out.println("Nhap diem GVHD: ");
        diemGVHD =sc.nextDouble();
        System.out.println("Nhap diem phan bien: ");
        diemPhanBien =sc.nextDouble();
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println("diem GVHD: "+ diemGVHD);
        System.out.println("diem phan bien: "+ diemPhanBien);
        System.out.println("Diem TB: "+ DTB());
    }

    @Override
    double DTB() {
        return (diemGVHD*2 + diemPhanBien)/2;
    }
}
