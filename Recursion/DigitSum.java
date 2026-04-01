// Sum of Digits
// Q : Write a program to find the sum of digits of a number using recursive function
public class DigitSum {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("Sum of all individual digits in number : "+num+" is : "+recursive_add(num));
    }
    public static int recursive_add(int n){
//        if(n == 0){
//            return 0;
//        }
//        int rem = n%10;
//        n = n / 10;
//        return rem + recursive_add(n);
        // one liner :
        if(n == 0){
            return 0;
        }
        else{
            return (n%10)+recursive_add(n/10);
        }
    }
}