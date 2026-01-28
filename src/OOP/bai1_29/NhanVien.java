package OOP.bai1_29;
import java.util.Scanner;

public abstract class NhanVien {
    String hoTen;
    int namVaoLam;
    final double LCB = 1490000;
    final Scanner sc = new Scanner(System.in);
    public NhanVien() {
    }

    public NhanVien(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }
    void Nhap(){
        System.out.print("ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("nam vao lam: ");
        this.namVaoLam = sc.nextInt();
    }
    void Xuat(){
        System.out.println("ho ten: "+this.hoTen);
        System.out.println("nam vao lam: "+this.namVaoLam);
    }
    abstract double  TinhLuong();
}
