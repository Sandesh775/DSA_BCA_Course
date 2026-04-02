public class CountingZeros {
    public static void main(String[] args) {
        int num = 100203;
        System.out.println("Number of zeros in number : "+countZero(num));
    }
    static int countZero(int n){
        return helper(n,0);
    }
    static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0){
            helper(num/10,count++);
        }
        return helper(num/10,count);
    }
}