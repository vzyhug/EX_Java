package SP;

import java.util.Scanner;
public class bai1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap m dong");
        int m = sc.nextInt();
        System.out.println("nhap n cot");
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("dung ma tran");
        String arr[][] = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "*";
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
