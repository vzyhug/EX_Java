package OOP.bai1_24;
import java.util.Scanner;


public class Diem2D {
    public int x,y;

    public Diem2D() {
    }
    public Diem2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void NhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("toa do X: ");
        x= sc.nextInt();
        System.out.println("toa do Y: ");
        y= sc.nextInt();
    }
    public void HienThi(){
        System.out.println("diem : ("+x+","+y+")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double KhoangCachDenO(){
        return Math.sqrt(Math.pow(x-0,2)+Math.pow(y-0,2));
    }
    public double KhoangCachDenDiem(Diem2D d){
        return Math.sqrt(Math.pow(x-d.x,2)+Math.pow(y-d.y,2));
    }
}
