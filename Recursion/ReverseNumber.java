// Here is a demonstration in many ways to find reverse of number using recursion
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
//        revNum(num);
//        System.out.println(rev);
//        revNumPrint(num);
        int result = revNum2(num,0);
        System.out.println(result);
        int result2 = revNum3(num);
        System.out.println(result2);
        int result3 = reverse(num);
        System.out.println(result3);
    }
    // first way !
    static int rev = 0;
    public static void revNum(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        rev = rev*10 + rem;
        revNum(n/10);
    }
    // second approach !
    public static int revNum2(int n, int sum){
        if(n == 0){
            return sum;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        return revNum2(n/10,sum);
    }
    // third way using helper method !
    public static int revNum3(int n){
        return revNumHelper(n, 0);
    }
    public static int revNumHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        return revNumHelper(n / 10, reversed * 10 + n % 10);
    }
    // Alternative: Using Math (No Helper Method)
    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        int digits = (int) Math.log10(n);// count digits in a number
        return (n % 10) * (int) Math.pow(10, digits) + reverse(n / 10);
        //      3 * 100 + 21
        //              2 * 10 + 1
    }
    // Normal casual way of printing from reverse
    public static void revNumPrint(int n){
        if(n == 0){
            return;
        }
        System.out.print(n%10);
        revNumPrint(n/10);
    }
}