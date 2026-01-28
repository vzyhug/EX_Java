package OOP;
import java.util.Scanner;

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
    void NhapDiem() {
        Scanner sc = new Scanner(System.in);
        super.NhapDiem();
        System.out.print("Nhap mau sac: ");
        this.mausac = sc.nextLine();
    }

    @Override
    void HienThi() {
        super.HienThi();
        System.out.println("Mau sac: "+this.mausac);
    }
}
