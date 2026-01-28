package OOP;

public class DaGiac_arr {
    Diem2D ds[];
    int soDinh;
    public DaGiac_arr(int soDinh){
        this.soDinh = soDinh;
        ds = new Diem2D[soDinh];
        for(int i=0;i<soDinh;i++){
            ds[i] = new Diem2D();
        }
    }

    public DaGiac_arr() {
    }

    public int getSoDinh() {
        return soDinh;
    }

    public void setSoDinh(int soDinh) {
        this.soDinh = soDinh;
    }
    void Nhap(){
        for(int i=0;i<soDinh;i++){
            System.out.println("Nhap dinh thu "+(i+1)+":");
            ds[i].NhapDiem();

        }
    }
    void Xuat(){
        for(int i=0;i<soDinh;i++){
            System.out.print("Dinh thu "+(i+1)+": ");
            ds[i].HienThi();
        }
    }
    double TinhChuVi(){
        double chuVi = 0;
        for(int i=0;i<soDinh-1;i++){
            chuVi += ds[i].KhoangCachDenDiem(ds[i+1]);
        }
        chuVi += ds[soDinh-1].KhoangCachDenDiem(ds[0]);
        return chuVi;
    }
    Diem2D DiemXaONhat(){
        Diem2D diemXaNhat = ds[0];
        for(int i=1;i<soDinh;i++){
            if(ds[i].KhoangCachDenO() > diemXaNhat.KhoangCachDenO()){
                diemXaNhat = ds[i];
            }
        }
        return diemXaNhat;
    }
}
