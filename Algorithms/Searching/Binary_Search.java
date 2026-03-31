// Note: Binary Search only and special design for efficiency in sorted array either in ascending or descending
// order, but should be sorted anyhow !
public class Binary_Search {
    public static void main(String[] args) {
        int [] sortedArray = {4,5,6,7,8,9,10};
        int find = 8;
        int index = binarySearch(sortedArray,find);
        if(index == -1){
            System.out.println("Target value not found in sorted array !");
            return;
        }
        System.out.println("Target value : "+find+" found in sorted array index no : "+index);
    }
    // return index if value found in array if not return -1 !
    static int binarySearch(int[] arr,int target){
        // index !
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start <= end){
            mid = start +(end - start)/2;//mid = (start + end)/2;// index
            if(target < arr[mid]){
                end = mid-1;

            } else if (target > arr[mid]) {
                start = mid+1;

            }
            else {
                return mid;
            }
//            else if(target == arr[mid]){
//                return mid;
//            }
        }
        return -1;
    }
}