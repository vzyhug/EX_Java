package OOP;
import java.util.Scanner;
public class DaGiacMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.print("Nhap so dinh cua da giac: ");
//        int n = sc.nextInt();
//        DaGiac_arr dg = new DaGiac_arr(n);
//        dg.Nhap();
//        dg.Xuat();
//        System.out.println("Chu vi da giac: "+dg.TinhChuVi());
//        Diem2D diemXaNhat = dg.DiemXaONhat();
//        System.out.print("Diem xa O nhat la: ");
//        diemXaNhat.HienThi();
        System.out.println("-----------------------------------");
        System.out.println("Su dung List de luu danh sach diem");
        System.out.print("Nhap so dinh cua da giac: ");
        int n = sc.nextInt();
        DaGiac_list dgList = new DaGiac_list();
        dgList.setSoDinh(n);
        dgList.setLstDiem(new java.util.ArrayList<>());
        dgList.Nhap(n);
        dgList.Xuat();
        System.out.println("Chu vi da giac: "+dgList.TinhChuVi());
        Diem2D diemXaNhatList = dgList.DiemXaONhat();
        System.out.print("Diem xa O nhat la: ");
        diemXaNhatList.HienThi();
    }
}
