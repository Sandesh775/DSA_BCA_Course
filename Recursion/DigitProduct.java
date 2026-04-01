// Product of digits
// Q : Write a program to find the product of all individual digits present in a particular number using recursion
public class DigitProduct {
    public static void main(String[] args) {
        int num = 505;
        System.out.println("Product of all individual digits in number : "+num+" is : "+recursive_multiply(num));
    }
    public static int recursive_multiply(int n){
        if(n%10 == n){
            return n;
        }
//      if(n == 0){
//            return 1;
//        }
        else{
            return (n%10)*recursive_multiply(n/10);
        }
    }
}
