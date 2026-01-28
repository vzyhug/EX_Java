package OOP;
import java.util.Scanner;

public abstract class MonHoc {
    String maMon;
    String tenMon;
    int soTinChi;
    final Scanner sc = new Scanner(System.in);

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public MonHoc() {
    }
    void Nhap(){
        System.out.println("Nhap ma mon: ");
        maMon = sc.nextLine();
        System.out.println("Nhap ten mon: ");
        tenMon = sc.nextLine();
        System.out.println("Nhap so tin chi: ");
        soTinChi = Integer.parseInt(sc.nextLine());
    }
    void Xuat(){
        System.out.println("Ma mon: "+ maMon);
        System.out.println("Ten mon: "+ tenMon);
        System.out.println("So tin chi: "+ soTinChi);
    }
    abstract double DTB();
}
