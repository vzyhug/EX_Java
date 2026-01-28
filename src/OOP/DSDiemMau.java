package OOP;
import java.util.Scanner;
public class DSDiemMau {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DiemMau pxA = new DiemMau(5,10,"Trang");
        pxA.HienThi();
        //
        DiemMau pxB = new DiemMau();
        pxB.NhapDiem();
        System.out.print("diem B goc ");
        pxB.HienThi();
        System.out.print("diem B doi di (10,8) ");
        pxB.x+=10;
        pxB.y+=8;
        pxB.HienThi();
        System.out.print("gan mau Vang cho B ");
        pxB.GanMau("Vang");
        pxB.HienThi();
    }
}
