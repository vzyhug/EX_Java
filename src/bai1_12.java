import java.util.Scanner;
public class bai1_12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = inp.nextInt();
        System.out.print("Cac uoc so cua " + n + " la: ");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
