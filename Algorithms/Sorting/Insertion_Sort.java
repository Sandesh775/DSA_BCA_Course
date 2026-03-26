public class Insertion_Sort {
    public static void main(String[] args) {
        int[] a = {3,4,1,5,2};
        System.out.println("Before sorting : ");
        for (int i: a){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        insertionSort(a);
        System.out.println("After sorting : ");
        for (int i: a){
            System.out.print(i+" ");
        }
    }
    static void insertionSort(int[] arr){
        for( int i = 1; i< arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
