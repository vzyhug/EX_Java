import java.util.Scanner;
public class bai1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap m dong");
        int m = sc.nextInt();
        System.out.println("nhap n cot");
        int n = sc.nextInt();
        for(int i =0; i < m; i++) {
            if(i==0||i==m-1){
                System.out.println("* ".repeat(n));
                continue;
            }
            for(int j =0; j < n; j++){
               if(j==0||j==n-1){
                   System.out.print("* ");
               } else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
