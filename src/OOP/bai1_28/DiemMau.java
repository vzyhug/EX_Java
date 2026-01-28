package OOP.bai1_28;
import java.util.Scanner;
import OOP.bai1_24.Diem2D;

public class DiemMau extends Diem2D{
    String mausac;

    public DiemMau(String mausac) {
        this.mausac = mausac;
    }
    public DiemMau() {}
    public DiemMau(int x, int y, String mausac) {
        super(x, y);
        this.mausac = mausac;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
    void GanMau(String m){
        this.mausac = m;
    }

    @Override
    public void NhapDiem() {
        Scanner sc = new Scanner(System.in);
        super.NhapDiem();
        System.out.print("Nhap mau sac: ");
        this.mausac = sc.nextLine();
    }

    @Override
    public void HienThi() {
        super.HienThi();
        System.out.println("Mau sac: "+this.mausac);
    }
}
