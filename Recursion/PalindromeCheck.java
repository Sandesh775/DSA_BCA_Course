// Checking if number is palindrome using String, to recursion method
public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(ispalin(num));
    }
    static boolean ispalin(int n){
        String num = String.valueOf(n);
        int start = 0;
        int end = num.length()-1;
        return palin(num,start,end);
    }
    static boolean palin(String n, int start , int end){
        if(start>=end){
            return true;
        }
        if(n.charAt(start) != n.charAt(end)){
            return false;
        }
        return palin(n,start+1,end-1);
    }
}