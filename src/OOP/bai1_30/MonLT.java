package OOP.bai1_30;
import java.util.Scanner;
public class MonLT extends MonHoc{
    double tieuLuan;
    double giuaKy;
    double cuoiKy;
    final Scanner sc = new Scanner(System.in);
    public double getTieuLuan() {
        return tieuLuan;
    }

    public void setTieuLuan(double tieuLuan) {
        this.tieuLuan = tieuLuan;
    }

    public double getGiuaKy() {
        return giuaKy;
    }

    public void setGiuaKy(double giuaKy) {
        this.giuaKy = giuaKy;
    }

    public double getCuoiKy() {
        return cuoiKy;
    }

    public void setCuoiKy(double cuoiKy) {
        this.cuoiKy = cuoiKy;
    }

    public MonLT() {
    }

    public MonLT(String maMon, String tenMon, int soTinChi, double tieuLuan, double giuaKy, double cuoiKy) {
        super(maMon, tenMon, soTinChi);
        this.tieuLuan = tieuLuan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }

    public MonLT(double tieuLuan, double giuaKy, double cuoiKy) {
        this.tieuLuan = tieuLuan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }

    @Override
    void Nhap() {
        super.Nhap();
        System.out.println("Nhap diem tieu luan: ");
        tieuLuan =sc.nextDouble();
        System.out.println("Nhap diem giua ky: ");
        giuaKy =sc.nextDouble();
        System.out.println("Nhap diem cuoi ky: ");
        cuoiKy =sc.nextDouble();
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println("diem tieu luan: "+ tieuLuan);
        System.out.println("diem giua ky: "+ giuaKy);
        System.out.println("diem cuoi ky: "+ cuoiKy);
        System.out.println("Diem TB: "+ DTB());
    }

    @Override
    double DTB() {
        return getTieuLuan()*0.2 + getGiuaKy()*0.3 + getCuoiKy()*0.5;
    }
}
