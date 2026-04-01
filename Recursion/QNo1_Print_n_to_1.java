// Q: Print all numbers from n to 1, using recursive function
import java.util.Scanner;
public class QNo1_Print_n_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        print(n);
    }
    static void print(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        print(num-1);
    }
}