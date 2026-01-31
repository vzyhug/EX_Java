package OOP.bai1_31;

public class KhachSan extends BatDongSan implements IPhiKinhDoanh {
    int soSao;

    public int getSoSao() {
        return soSao;
    }

    public void setSoSao(int soSao) {
        this.soSao = soSao;
    }

    public KhachSan() {
    }

    public KhachSan(int soSao) {
        this.soSao = soSao;
    }

    public KhachSan(String maSo, double chieuDai, double chieuRong, int soSao) {
        super(maSo, chieuDai, chieuRong);
        this.soSao = soSao;
    }

    @Override
    public double TinhGiaTri() {
        return 100000 + soSao*50000;
    }
    public double TinhPhiKinhDoanh() {
        return chieuRong*chieuRong*5000;
    }

    @Override
    void Nhap() {
        super.Nhap();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("gia ban cua BDS Khach San : "+TinhGiaTri()+TinhPhiKinhDoanh());
    }
}
