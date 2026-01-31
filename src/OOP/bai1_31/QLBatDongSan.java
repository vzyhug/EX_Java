package OOP.bai1_31;

import java.util.ArrayList;
import java.util.List;

public class QLBatDongSan {
    public static void main(String[] args) {
        DatTrong dt = new DatTrong();
        dt.Nhap();
        //
        NhaO nha = new NhaO();
        nha.Nhap();
        //
        BietThu bietThu = new BietThu();
        bietThu.Nhap();
        //
        KhachSan ks = new KhachSan();
        ks.Nhap();
        //
        List<BatDongSan> bds = new ArrayList();
        bds.add(nha);
        bds.add(bietThu);
        bds.add(ks);
        bds.add(dt);
        //
        bds.forEach(bd -> bd.Xuat());
    }
}
