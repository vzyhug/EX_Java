import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class bai1_22 {
    public static final int MAX_SIZE = 500;
    public static Scanner sc = new Scanner(System.in);
    public static void loadOptions(){
        System.out.println("1. Nhap mang");
        System.out.println("2. Ngau nhien");
        System.out.println("3. In mang");
        System.out.println("4. Liet ke gia tri am");
        System.out.println("5. Liet ke so nguyen to");
        System.out.println("6. Liet ke pha tu trong [a,b]");
        System.out.println("7. Tong cac SNT");
        System.out.println("8. TCB so duong");
        System.out.println("9. Dem so phan tu > x");
        System.out.println("10. Dem so phan tu SNT");
        System.out.println("11. Kiem tra mang thuan SNT ?");
        System.out.println("12. Kiem tra mang tang ?");
        System.out.println("13. Tim phan tu lon nhat");
        System.out.println("14. Tim phan tu nho nhat");
        System.out.println("15. So am max");
        System.out.println("16. Dao nguoc mang");
        System.out.println("0. Thoat chuong trinh");
        System.out.print("Nhap lua chon cua ban: ");
    }
    public static void loadArray(int[] arr,int n){
        System.out.println("Nhap cac phan tu cho mang: ");
        for(int i =0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }
    public static void loadRandomArray(int[] arr, int n){
        System.out.println("Nhap cac phan tu cho mang: ");
        for(int i =0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
    }
    public static void printArray(int[] arr, int n){
        System.out.println("Cac phan tu trong mang la: ");
        for(int i =0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printNegativeNumbers(int[] arr, int n){
        System.out.println("Cac phan tu am trong mang la: ");
        for(int i =0; i < n; i++) {
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i =2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void printPrime(int[] arr, int num){
        System.out.println("Cac so nguyen to trong mang la: ");
        for(int i =0; i < num; i++) {
            if(isPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void printRange(int[] arr, int n, int a, int b){
        System.out.println("Cac phan tu trong khoang [" + a + "," + b + "] la: ");
        for(int i =0; i < n; i++) {
            if(arr[i] >= a && arr[i] <= b){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static int sumPrime(int[] arr, int n){
        int sum =0;
        for(int i =0; i < n; i++) {
            if(isPrime(arr[i])){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int choice;
        do {
            System.out.println("-------------------------");
            loadOptions();
            System.out.println("lua chon: ");
            choice = sc.nextInt();
            switch(choice){
                    case 0:
                        System.out.println("Thoat chuong trinh");break;
                    case 1:
                        loadArray(arr,n);break;
                    case 2:
                        loadRandomArray(arr,n);break;
                    case 3:
                        printArray(arr,n);
                        Arrays.stream(arr).forEach(System.out::println);
                        break;
                    case 4:
                        printNegativeNumbers(arr,n);
                        System.out.println("khong dung ham : ");
                        Arrays.stream(arr).filter(num->num<0).forEach(System.out::println);
                        break;
                    case 5:
                        printPrime(arr,n);
                        System.out.println("khong dung ham : ");
                        Arrays.stream(arr).filter(num->isPrime(num)).forEach(System.out::println);
                        break;
                    case 6:
                        System.out.println("Nhap gia tri a: ");
                        int a = sc.nextInt();
                        System.out.println("Nhap gia tri b: ");
                        int b = sc.nextInt();
                        printRange(arr,n,a,b);
                        break;
                    case 7:
                        int sum = sumPrime(arr,n);
                        System.out.println("Tong cac so nguyen to trong mang la: " + sum);
                        System.out.println("tong khong dung ham : "+ Arrays.stream(arr).filter(x -> isPrime(x)).sum());
                        break;
                    case 8:
                        System.out.println("Trung binh cong cac so duong trong mang la: " + Arrays.stream(arr).filter(x -> x > 0).average().orElse(0));
                        break;
                    case 9:
                        System.out.println("Nhap gia tri x: ");
                        int x = sc.nextInt();
                        long countGreaterThanX = Arrays.stream(arr).filter(num -> num > x).count();
                        System.out.println("So phan tu lon hon " + x + " la: " + countGreaterThanX);
                        break;
                default:
                    System.out.println("Lua chon khong hop le.Vui long chon lai");break;

            }
        }while(choice !=0);
    }
}
