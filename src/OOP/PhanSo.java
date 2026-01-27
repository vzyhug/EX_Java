package OOP;
import java.util.Scanner;
public class PhanSo {
    int tu,mau;

    public PhanSo() {
    }
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau=mau;
    }
    public PhanSo(PhanSo p) {
        tu = p.tu;
        mau = p.mau;
    }
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        if(mau!=0){
            this.mau = mau;
        }
    }
    void NhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu: ");
        tu = sc.nextInt();
        do{
            System.out.println("nhap mau: ");
            mau = sc.nextInt();
        }while(mau==0);
    }
    void HienThi() {
        if(tu<0||mau<0){
            System.out.println("phan so: "+-tu+"/"+mau);
        }
        else if(tu==0){
            System.out.println("phan so: "+ 0);
        }
        else if (mau==1){
            System.out.println("phan so: "+ tu);
        }
        else{
            System.out.println("phan so: "+ tu+"/"+mau);
        }
    }
    void NghichDaoPhanSo() {
        int temp ;
        temp = tu;
        this.tu = this.mau;
        mau = temp;
    }
    void GiaTriNghicDao(PhanSo p) {
        p.tu = this.mau;
        p.mau = this.tu;
    }
    double GiaTriPhanSo() {
        return tu/mau;
    }
    boolean LonHon(PhanSo p) {
        return (this.tu*p.mau>p.tu*this.mau) ? true : false;
    }
    //
    PhanSo TongPhanSo(int a) {
        return (new PhanSo(this.tu+a*this.mau,this.mau));
    }
    PhanSo HieuPhanSo(int a) {
        return (new PhanSo(this.tu-a*this.mau,this.mau));
    }
    PhanSo TichPhanSo(int a) {
        return (new PhanSo(this.tu*a,this.mau));
    }
    PhanSo ThuongPhanSo(int a) {
        return (new PhanSo(this.tu,this.mau*a));
    }
    //
    PhanSo TongHaiPhanSo(PhanSo p) {
        return (new PhanSo(this.tu*p.mau+p.tu*this.mau,this.mau*p.mau));
    }
    PhanSo HieuHaiPhanSo(PhanSo p) {
        return (new PhanSo(this.tu*p.mau-p.tu*this.mau,this.mau*p.mau));
    }
    PhanSo TicHaiPhanSo(PhanSo p) {
        return (new PhanSo(this.tu*p.tu,this.mau*p.mau));
    }
    PhanSo ThuongHaiPhanSo(PhanSo p) {
        return (new PhanSo(this.tu*p.mau,this.mau*p.tu));
    }
    //
    void ToiGianPhanSo(){
        int max = (tu>=mau) ? tu : mau;
        int UCLN =1;
        for(int i=max;i>0;i--){
            if(tu%i==0&&mau%i==0){
                UCLN=i;
                break;
            }
        }
        tu = tu/UCLN;
        mau = mau/UCLN;
    }
}
