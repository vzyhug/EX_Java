package OOP.bai1_26;
import OOP.bai1_24.Diem2D;

public class TamGiac {
    Diem2D dinh1 ,dinh2,dinh3;

    public Diem2D getDinh1() {
        return dinh1;
    }

    public void setDinh1(Diem2D dinh1) {
        this.dinh1 = dinh1;
    }

    public Diem2D getDinh2() {
        return dinh2;
    }

    public void setDinh2(Diem2D dinh2) {
        this.dinh2 = dinh2;
    }

    public Diem2D getDinh3() {
        return dinh3;
    }

    public void setDinh3(Diem2D dinh3) {
        this.dinh3 = dinh3;
    }

    public TamGiac() {
    }

    public TamGiac(Diem2D d1, Diem2D d2, Diem2D d3) {
        this.dinh1 = d1;
        this.dinh2 = d2;
        this.dinh3 = d3;
    }
    public TamGiac(TamGiac tg){
        this.dinh1 = tg.getDinh1();
        this.dinh2 = tg.getDinh2();
        this.dinh3 = tg.getDinh3();
    }
    //
    void Nhap(){
        dinh1.NhapDiem();
        dinh2.NhapDiem();
        dinh3.NhapDiem();
    }
    void Xuat(){
        System.out.println("tam giac co toa do cac diem : ");
        dinh1.HienThi();
        dinh2.HienThi();
        dinh3.HienThi();
    }
    double TinhChuVi(){
        double a = dinh1.KhoangCachDenDiem(dinh2);
        double b = dinh2.KhoangCachDenDiem(dinh3);
        double c = dinh3.KhoangCachDenDiem(dinh1);
        return a+b+c;
    }
    double TinhDienTich(){
        double a = dinh1.KhoangCachDenDiem(dinh2);
        double b = dinh2.KhoangCachDenDiem(dinh3);
        double c = dinh3.KhoangCachDenDiem(dinh1);
        double nuaChuVi = TinhChuVi()/2;
        return Math.sqrt(nuaChuVi*(nuaChuVi-a)*(nuaChuVi-b)*(nuaChuVi-c));
    }
}
