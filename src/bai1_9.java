import java.util.Scanner;
public class bai1_9 {
    static Scanner sc = new Scanner(System.in);
    public static int paymentBill(int unit){

        if(0<=unit && unit<=50){
            return 1480*unit;
        }
        else if(unit <= 100){
            return 1533*(unit-50) + paymentBill(50);
        }
        else if(unit <= 200){
            return 1786*(unit-100) + paymentBill(100);
        }
        else if(unit <= 300){
            return 2242*(unit-200) + paymentBill(200);
        }
        else{
            return 2503*(unit-300) + paymentBill(300);
        }
    }
    public static void main(String[] args) {
        System.out.println("Old value: ");
        int oldValue = sc.nextInt();
        System.out.println("New value: ");
        int newValue = sc.nextInt();
        try{
            if (oldValue > newValue) {
                throw new Exception("Old value is greater than new value");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }
        int unitBill = newValue - oldValue;
        System.out.println("Electricity bill: " + unitBill + " units");
        int totalMoney = paymentBill(unitBill);
        System.out.println("Total money: " + totalMoney + " VND");
    }
}
