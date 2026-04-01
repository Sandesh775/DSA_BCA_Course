// Q : find the factorial of entered number !
import java.util.Scanner;
public class Qno4_Product_of_n_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Factorial of number is : "+factorial(num));
    }
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}