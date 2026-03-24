public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {10,2,1,20,3,5};
        int n = arr.length;
        System.out.println("Before performing Bubble sorting !:");
        for( int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        bubble_sorting(arr,n);
        System.out.println("After performing Bubble sorting !:");
        for( int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void bubble_sorting(int[] array, int n){
        boolean isSwap = false;
        int temp = 0;
        for( int i = 0; i<n-2; i++){
            isSwap = false;
            for( int j = 0; j<n-2-i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }
}