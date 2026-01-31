package OOP.bai1_31;

public class DatTrong extends BatDongSan {
    public DatTrong() {
    }

    public DatTrong(String maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
    }

    @Override
    public double TinhGiaTri() {
        return chieuRong*chieuDai*10000;
    }

    @Override
    void Nhap() {
        super.Nhap();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("gia ban cua BDS Biet Thu : "+TinhGiaTri());
    }
}
