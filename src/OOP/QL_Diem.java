package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QL_Diem {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<MonHoc> lstMonHoc = new ArrayList<MonHoc>();
        // mon ly thuyet
        System.out.println("Nhap thong tin mon ly thuyet: ");
        MonLT monLT = new MonLT();
        monLT.Nhap();
        lstMonHoc.add(monLT);
        // mon thuc hanh
        System.out.println("Nhap thong tin mon thuc hanh: ");
        MonTh monTH = new MonTh();
        monTH.Nhap();
        lstMonHoc.add(monTH);
        // mon do an
        System.out.println("Nhap thong tin mon do an: ");
        MonDoAn monDA = new MonDoAn();
        monDA.Nhap();
        lstMonHoc.add(monDA);
        // xuat danh sach mon hoc
        System.out.printf("DANH SACH MON HOC\n");
        for(MonHoc mh : lstMonHoc){
            mh.Xuat();
        }
    }

}
