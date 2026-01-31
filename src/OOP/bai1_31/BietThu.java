package OOP.bai1_31;

public class BietThu extends BatDongSan implements IPhiKinhDoanh {
    public BietThu() {

    }

    public BietThu(String maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
    }

    @Override
    public double TinhGiaTri() {
        return chieuDai*chieuRong*chieuRong*40000;
    }

    @Override
    public double TinhPhiKinhDoanh() {
        return chieuDai*chieuRong*1000;
    }

    @Override
    void Nhap() {
        super.Nhap();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("gia ban cua BDS Biet Thu : "+TinhGiaTri()+TinhPhiKinhDoanh());
    }
}
