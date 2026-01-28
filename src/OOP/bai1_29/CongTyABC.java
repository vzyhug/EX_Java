package OOP.bai1_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CongTyABC {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<NhanVien> lstNhanVien = new ArrayList<NhanVien>();
        // nv san xuat
        System.out.println("NHAP THONG TIN NHAN VIEN SAN XUAT");
        NV_SanXuat vnSanXuat = new NV_SanXuat();
        vnSanXuat.Nhap();
        lstNhanVien.add(vnSanXuat);
        // nv van phong
        System.out.println("NHAP THONG TIN NHAN VIEN VAN PHONG");
        NV_VanPhong nvVanPhong = new NV_VanPhong();
        nvVanPhong.Nhap();
        lstNhanVien.add(nvVanPhong);
        // nv quan ly
        System.out.println("NHAP THONG TIN NHAN VIEN QUAN LY");
        NV_QuanLy nvQuanLy = new NV_QuanLy();
        nvQuanLy.Nhap();
        lstNhanVien.add(nvQuanLy);
        // xuat danh sach nhan vien
        System.out.println("DANH SACH NHAN VIEN");
        for (NhanVien nv : lstNhanVien) {
            nv.Xuat();
            System.out.println("---------------------");
        }
    }


}
