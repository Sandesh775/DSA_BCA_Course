// Q: Print all numbers from 1 to n, using recursive function
import java.util.Scanner;
public class QNo2_Print_1_to_n {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int n = sc.nextInt();
            printrev(n);
        }
        static void printrev(int num){
            if(num == 0){
                return;
            }
            printrev(num-1);
            System.out.println(num);
        }
}