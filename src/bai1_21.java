import java.util.Scanner;
public class bai1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao h : ");
        int h = sc.nextInt();
        for(int i=0;i<h;i++){
            for(int j=0;j<=i;j++){
                if(j==i||j==0||i==h-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
