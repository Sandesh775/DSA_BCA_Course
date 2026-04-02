// Q : This is the demonstration of passing numbers concept in function n-- vs --n or n++ vs ++n
public class PassingNumberConcept {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n--);// since it pass first and then subtract value , it will always be passing the original value 5
        print(--n);// since it subtract value first then pass value will work correctly for our purpose of code or program
    }
}