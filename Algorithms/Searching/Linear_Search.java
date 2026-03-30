public class Linear_Search {
    public static void main(String[] args) {
        int [] a = {1,11,20,19,25,10,36,80,9};
        int target = 10;
        int find = linearSearch(a,target);
        System.out.print("Array : ");
        for (int i: a){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        if(find == -1){
            System.out.println("Target value : "+target+" not found in array !");
            return;
        }
        System.out.println("Target value : "+target+" found in array at index : "+find);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;// return -1 if array is empty !
        }
        for( int i = 0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;//if not found return -1 index
    }
//    static int linearSearchElement(int[] arr, int target){
//        if(arr.length == 0){
//            return Integer.MAX_VALUE;
//        }
//        for( int i:arr){
//            if(i == target){
//                return i;// return element !
//            }
//        }
//        return Integer.MAX_VALUE;//if not found return false
//    }
//    static boolean linearSearchCheck(int[] arr, int target){
//        if(arr.length == 0){
//            return false;
//        }
//        for( int i:arr){
//            if(i == target){
//                return true;// return element !
//            }
//        }
//        return false;//if not found return random value
//    }
}