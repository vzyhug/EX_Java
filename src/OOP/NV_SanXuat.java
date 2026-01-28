package OOP;

public class NV_SanXuat extends NhanVien {
    int soSanPham;

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }
    public NV_SanXuat() {}
    public NV_SanXuat(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public NV_SanXuat(String hoTen, int namVaoLam, int soSanPham) {
        super(hoTen, namVaoLam);
        this.soSanPham = soSanPham;
    }

    @Override
    void Nhap() {
        super.Nhap();
        System.out.print("so san pham: ");
        this.soSanPham = sc.nextInt();
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println("Nhan vien san xuat");;
        System.out.println("so san pham: " + this.soSanPham);
        System.out.println("luong: " + this.TinhLuong());
    }

    @Override
    double TinhLuong() {
        return LCB+(getSoSanPham()*2000);
    }
}
