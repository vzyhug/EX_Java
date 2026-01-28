package OOP;

import java.lang.reflect.Array;
import java.util.*;

public class DSPhanSo {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
//        PhanSo psA = new PhanSo(3,7);
//        PhanSo psB = new PhanSo(4,8);
//        psA.ToiGianPhanSo();
//        psA.HienThi();
//        psB.ToiGianPhanSo();
//        psB.HienThi();
//        //
//        PhanSo psX = new PhanSo();
//        PhanSo psY = new PhanSo();
//        psX.NhapPhanSo();
//        psX.HienThi();
//        psY.NhapPhanSo();
//        psY.HienThi();
//        //
//        System.out.println("nghich dao cua phan so X" );
//        PhanSo psnd = new PhanSo(psX.getMau(), psX.getTu());
//        psnd.HienThi();
//        //
//        System.out.println("tong phan so X va Y: ");
//        PhanSo kq = new PhanSo(psX.TongHaiPhanSo(psY));
//        kq.ToiGianPhanSo();
//        kq.HienThi();
//        //\\
        System.out.println("so luong pphan tu: ");
        int n = sc.nextInt();
        List<PhanSo> lstPhanSo = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            lstPhanSo.add(new PhanSo(rand.nextInt(100),rand.nextInt(100)));
        }
        lstPhanSo.forEach((t)->t.HienThi());
        System.out.println("tong cac phan so: ");
        PhanSo sum =lstPhanSo.stream().reduce(new PhanSo(0,1),PhanSo::TongHaiPhanSo);
        sum.HienThi();
        System.out.println("tong sau khi toi gian: ");
        sum.ToiGianPhanSo();
        sum.HienThi();
        //
        System.out.println("phan so lon nhat");
        PhanSo max = lstPhanSo.stream().max((p1, p2)->p1.tu*p2.mau - p2.tu*p1.mau).orElse(new PhanSo(0,1));
        max.HienThi();
        //
        System.out.println("sap xep danh sach: ");
        List<PhanSo> lstSort =lstPhanSo.stream().sorted((p1,p2)->p1.tu*p2.mau - p2.tu*p1.mau).toList();
        lstSort.forEach((t)->t.HienThi());
    }
}
