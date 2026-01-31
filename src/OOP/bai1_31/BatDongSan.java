package OOP.bai1_31;
import java.util.Scanner;

public abstract class BatDongSan {
    String maSo;
    double chieuDai;
    double chieuRong;

    public BatDongSan() {
    }

    public BatDongSan(String maSo, double chieuDai, double chieuRong) {
        this.maSo = maSo;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public abstract double TinhGiaTri();
    void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("thong tin BDS ");
        System.out.print("ma so :");
        maSo = sc.nextLine();
        System.out.print("chieu dai :");
        chieuDai = sc.nextDouble();
        System.out.print("chieu rong :");
        chieuRong = sc.nextDouble();
    }
    public void Xuat(){
        System.out.println("thong tin BDS ");
        System.out.print("ma so :"+maSo);
        System.out.print("chieu dai :"+chieuDai);
        System.out.print("chieu rong :"+chieuRong);
    }
}
