// Q: Write a java program to check if a number is palindrome using recursion
public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        System.out.println("Is num : "+n+" a palindrome : "+checkPalindrome(n));
    }
    public static boolean checkPalindrome(int num){
        int rev = check(num);
        if(num == rev){
            return true;
        }
        return false;
    }
    static int check(int num){
        if (num < 10) {
            return num;
        }
        int rem = num % 10;
        int digit = (int)(Math.log10(num));
        return rem*(int)(Math.pow(10,digit))+check(num/10);
    }
}