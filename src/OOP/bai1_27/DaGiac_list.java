package OOP.bai1_27;

import OOP.bai1_24.Diem2D;

import java.util.List;

public class DaGiac_list {
    List<Diem2D> lstDiem;
    int soDinh;

    public DaGiac_list() {
    }

    public DaGiac_list(List<Diem2D> lstDiem, int soDinh) {
        this.lstDiem = lstDiem;
        this.soDinh = soDinh;
    }

    public List<Diem2D> getLstDiem() {
        return lstDiem;
    }

    public void setLstDiem(List<Diem2D> lstDiem) {
        this.lstDiem = lstDiem;
    }

    public int getSoDinh() {
        return soDinh;
    }

    public void setSoDinh(int soDinh) {
        this.soDinh = soDinh;
    }
    void Nhap(int n){
        for(int i=0;i<n;i++){
            System.out.println("Nhap dinh thu "+(i+1)+":");
            Diem2D d = new Diem2D();
            d.NhapDiem();
            lstDiem.add(d);
        }
    }
    void Xuat(){
        lstDiem.forEach(d->d.HienThi());
    }
    double TinhChuVi(){
        double chuVi = 0;
        for(int i=0;i<soDinh-1;i++){
            chuVi += lstDiem.get(i).KhoangCachDenDiem(lstDiem.get(i+1));
        }
        chuVi += lstDiem.get(soDinh-1).KhoangCachDenDiem(lstDiem.get(0));
        return chuVi;
    }
    Diem2D DiemXaONhat(){
        Diem2D diemXaNhat = lstDiem.get(0);
        for(int i=1;i<soDinh;i++){
            if(lstDiem.get(i).KhoangCachDenO() > diemXaNhat.KhoangCachDenO()){
                diemXaNhat = lstDiem.get(i);
            }
        }
        return diemXaNhat;
    }
}
