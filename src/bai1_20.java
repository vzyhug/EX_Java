import java.util.Scanner;
public class bai1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao h : ");
        int h = sc.nextInt();
        int w = 2*h -1;
        int mid = w/2;
        if(h%2==0){
            for(int i=0;i<h;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else {
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(j>=mid - i && j<= mid + i){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
