// Nothing big , just a small doubt and after assuming array is sorted
// How can you be sure if it is in ascending order or in descending order ?
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,2,3,0,-1,-30,-500};
        int target = 0;
        boolean found = binarySearch(arr,target);
        System.out.println(found);
    }
    static boolean binarySearch(int[] a, int value){
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        boolean isAscOrder = false;
//        if(a[0] < a[a.length-1]){// is in ascending order
//            isAscOrder = true;
//        }
        if(a[start] < a[end]){
            isAscOrder = true;
        }
        while (start <= end){
            mid = start +(end - start)/2;//mid = (start + end)/2;// index
            if(value == a[mid]){
                return true;
            }
            if(isAscOrder){
                if(value < a[mid] ){
                    end = mid-1;
                }
                else if (value > a[mid]) {
                    start = mid+1;
                }
            }
            else {
                if (value < a[mid]) {// remaining part is right side from mid, in descending order
                    start = mid + 1;
                } else {// else if (value > a[mid] && !isAscOrder) // remaining part is left side from mid, in descending order
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
/*
* else if(value < a[mid] && isAscOrder){
                end = mid-1;
            }
            else if(value < a[mid] && !isAscOrder){// remaining part is right side from mid, in descending order
                start = mid+1;
            }
            else if (value > a[mid] && isAscOrder) {
                start = mid+1;
            }
            else{// else if (value > a[mid] && !isAscOrder) // remaining part is left side from mid, in descending order
                end = mid-1;
            }*/
/*
* if(a[0] < a[a.length-1]){// is in ascending order
            int start = 0;
            int end = a.length-1;
            int mid = 0;
            while (start <= end){
                mid = start +(end - start)/2;//mid = (start + end)/2;// index
                if(value < a[mid]){
                    end = mid-1;

                } else if (value > a[mid]) {
                    start = mid+1;

                }
                else {
                    return true;
                }
            }
            return false;
        }
        else{// is in descending order, where a[a.length-1] < a[0]
            int start = 0;
            int end = a.length-1;
            int mid = 0;
            while (start <= end){
                mid = start +(end - start)/2;//mid = (start + end)/2;// index
                if(value == a[mid]){
                    return true;
                } else if (value > mid) {// remaining part is left side from mid
                    end = mid-1;
                }
                else {// remaining part is right side from mid
                    start = mid+1;
                }
        }
            return false;
        }*/