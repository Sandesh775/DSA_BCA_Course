// Given an integer num, write a program to find the number of steps to reduce it to zero
public class CountSteps {
    public static void main(String[] args) {
        int num = 8;
        System.out.println("Steps to reduce "+num+" into 0 is "+countStep(num));
    }
    static int countStep(int n){
        return helper(n,0);
    }
    static int helper(int num, int step){
        if(num == 0){
            return step;
        }
        if(num % 2 == 0){
            return helper(num/2,step+1);
        }
        return helper(num-1,step+1);
    }
}