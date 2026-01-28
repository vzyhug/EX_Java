package OOP.bai1_29;

public class NV_VanPhong extends NhanVien{
    int soNgayLamViec;
    double troCap;

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public double getTroCap() {
        return troCap;
    }

    public void setTroCap(double troCap) {
        this.troCap = troCap;
    }
    public NV_VanPhong() {}
    public NV_VanPhong(int soNgayLamViec, double troCap) {
        this.soNgayLamViec = soNgayLamViec;
        this.troCap = troCap;
    }

    public NV_VanPhong(String hoTen, int namVaoLam, int soNgayLamViec, double troCap) {
        super(hoTen, namVaoLam);
        this.soNgayLamViec = soNgayLamViec;
        this.troCap = troCap;
    }

    @Override
    double TinhLuong() {
        return LCB+(getSoNgayLamViec()*100000)+getTroCap();
    }

    @Override
    void Nhap() {
        super.Nhap();
        System.out.print("so ngay lam viec: ");
        this.soNgayLamViec = sc.nextInt();
        System.out.print("tro cap: ");
        this.troCap = sc.nextDouble();
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println("Nhan vien van phong");
        System.out.println("so ngay lam viec: "+this.soNgayLamViec);
        System.out.println("tro cap: "+this.troCap);
        System.out.println("luong: "+this.TinhLuong());
    }
}
