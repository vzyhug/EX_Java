package OOP.bai1_31;

import java.util.Scanner;

public class NhaO extends BatDongSan  {
    int soLau;

    public int getSoLau() {
        return soLau;
    }

    public NhaO() {
    }

    public void setSoLau(int soLau) {
        this.soLau = soLau;
    }
    public NhaO(int soLau) {
        this.soLau = soLau;
    }

    public NhaO(String maSo, double chieuDai, double chieuRong, int soLau) {
        super(maSo, chieuDai, chieuRong);
        this.soLau = soLau;
    }

    @Override
    public double TinhGiaTri() {
        return chieuDai*chieuRong+(soLau*chieuDai*100000);
    }

    @Override
    void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        soLau = sc.nextInt();

    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("soLau : "+soLau);
        System.out.println("gia ban cua BDS Nha o : "+TinhGiaTri());
    }
}
