import java.util.Scanner;
public class bai1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<Integer.toString(n).length();i++){
            if(Integer.toString(n).charAt(i) %2 == 0){
                sum += Integer.parseInt(String.valueOf(Integer.toString(n).charAt(i)));
            }
        }
        System.out.println("Tong cac chu so chan trong n la: " + sum);
    }
}
