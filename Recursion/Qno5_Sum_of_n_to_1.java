// Q : find the sum of n to 1 using recursive function
import java.util.Scanner;
public class Qno5_Sum_of_n_to_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            System.out.println("Sum of N to 1 : "+sum(num));
        }
        public static int sum(int n){
            if(n == 1){
                return 1;
            }
            return n+sum(n-1);
        }
    }