public class BinarySearch_Using_Recursion {
    public static void main(String[] args) {
        int [] arr = {-1,0,3,4,6,9,10,14,25,99,101};
        int value = 9;
        System.out.println("Index : "+search(arr,value,0,arr.length-1));
    }
    public static int search(int[] a,int target, int start, int end){
        if(start>end){
            return -1;// start came and increment to end+1 then now there is no chance to found element
        }
        int mid = start + (end-start)/2;
        if(a[mid] == target){
            return mid;
        }
        else if(target < a[mid]){
            return search(a,target,start,mid-1);// end = mid - 1;
        }
        else {
            return search(a,target,mid+1,end);// start = mid + 1;
        }
    }
}