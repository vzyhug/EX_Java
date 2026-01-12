import java.util.Scanner;
public class bai1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        System.out.print("Cac chu so le trong n la: ");
        for (int i = 0; i < Integer.toString(n).length(); i++) {
            if(Integer.toString(n).charAt(i) %2 != 0){
                System.out.print(Integer.toString(n).charAt(i) + " ");
            }
        }
    }
}
