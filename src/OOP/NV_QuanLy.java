package OOP;
import java.util.Scanner;

public class NV_QuanLy extends NhanVien{
    double heSoChucVu;
    double thuong;
    final Scanner sc = new Scanner(System.in);

    public double getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(double heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }
    public NV_QuanLy() {}
    public NV_QuanLy(double heSoChucVu, double thuong) {
        this.heSoChucVu = heSoChucVu;
        this.thuong = thuong;
    }

    public NV_QuanLy(String hoTen, int namVaoLam, double heSoChucVu, double thuong) {
        super(hoTen, namVaoLam);
        this.heSoChucVu = heSoChucVu;
        this.thuong = thuong;
    }

    @Override
    void Nhap() {
        super.Nhap();
        System.out.print("he so chuc vu: ");
        this.heSoChucVu = sc.nextDouble();
        System.out.print("thuong: ");
        this.thuong = sc.nextDouble();
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println("Nhan vien quan ly");
        System.out.println("he so chuc vu: "+this.heSoChucVu);
        System.out.println("thuong: "+this.thuong);
        System.out.println("luong: "+this.TinhLuong());
    }

    @Override
    double TinhLuong() {
        return LCB*getHeSoChucVu()+getThuong();
    }
}
