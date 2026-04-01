// Q: print both form from 1 to N and also from N to 1 using same recursive function !
import java.util.Scanner;
public class QNo3_Print_in_both_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        prints(n);
    }
    static void prints(int num){
        if(num == 0){
            return;
        }
        System.out.print(num+" ");
        prints(num-1);
        System.out.print(num+" ");
    }
}