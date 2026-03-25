public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,0,3,5,6};
        selectionSort(arr);
        System.out.println("After selection sorting : ");
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
    static void selectionSort(int [] a){
        for(int i = 0; i<a.length-1; i++){
            int last = a.length-1-i;
            int max = 0;
            for( int j = max; j<=last;j++){
                if(a[j] > a[max]){
                    max = j;
                }
            }
            if(max != last) {
                swap(a, max, last);// swap max number index with (last index or correct index)
            }
        }
    }
    static void swap(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}