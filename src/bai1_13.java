import java.util.Scanner;
public class bai1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        System.out.print("Cac uoc so le cua " + n + " la: ");
        for(int i = 1; i <= n; i++){
            if(n % i == 0 && i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
