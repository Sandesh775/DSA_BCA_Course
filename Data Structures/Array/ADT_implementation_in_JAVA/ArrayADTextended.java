package ADT_implementation_in_JAVA;

public class ArrayADTextended {
    public static void main(String[] args) {
        MyArray2 a = new MyArray2(5);
        MyArray2 ref = a;// here ref is a reference variable for object a
        // so let's create an array of elements to be passed or stored or push
        int [] elements = {1,3,4,5};
        // then passed this array to push() method !
        a.push(elements);
        System.out.println("Size of an array used : "+ref.displayCurrentSize()+" Total capacity or length of an array : "+ref.displayLengthArray());
        a.sortAscending();
        a.sortDescending();
        int largestNum = a.findLargestNum();
        int smallestNum = a.findSmallestNum();
        System.out.println("largest element in an array : "+largestNum+" smallest : "+smallestNum);
        a.pop(2);
        System.out.println("after pop 2 elements from end : ");
        a.displayArray();
    }
}
class MyArray2{// just not continuing with the MyArray class cause i want to demonstrate some extra features in this one seperately
    private int[] arr;
    private int capacity ;
    private int size;
    MyArray2(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;// as always number of elements or used capacity
    }
    public int getCapacity(){
        return capacity;
    }
    public int getSize(){
        return size;
    }
    // here i won't repeat the features of MyArray but introduce to new
    // like giving largest element, giving second largest element, sorting in ascending, sorting in descending
    // push method , push element at the end
//    public void push(int value){
//        if( size == capacity){
//            System.out.println("Array is full !");
//            return;
//        }
//        arr[size] = value;
//        size++;
//    }
// this is how we do push element for MyArray , but now what if user want to push more than one element at a time, and
// also think same about pop want to remove more than one element from end ????
// pop method, pop element from end
//    public void pop(){
//        if(size == 0){
//            System.out.println("Array is empty !");
//            return;
//        }
//        arr[size-1] = 0;
//        size--;
//    }
    public void pop(int n){// here is method to remove more than one element from end
        if(size == 0){
            System.out.println("Array is empty !");
            return;
        }
        while(n > 0){
            arr[size-1] = 0;
            size--;
            n--;
        }
    }
    public void push(int[] elements){
        if(size == capacity){
            System.out.println("Array is full !");
            return;
        }
        for( int i = 0; i<elements.length; i++){
            if(i < capacity){
                arr[size] = elements[i];
                size++;
            }
            else {
                System.out.println("Array full! Could only add " + i + " elements");
                break;
            }
        }
    }
    // display method
    public void displayArray(){
        for( int i = 0; i<size; i++){// remember last element is always at index = size-1, except it is empty ?
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    // method to return largest element present in the array :
    public int findLargestNum(){
        if(size == 0){
            return -1;// since the array is empty
        } else if (size == 1) {
            return arr[size];// there is only one element so whatever smallest or largest is it is !
        }
        int largest = arr[0];
        for( int i = 1; i<size; i++){
            if( arr[i] > largest ){
                largest = arr[i];
            }
        }
        return largest;
    }
    // method to return smallest element present in the array :
    public int findSmallestNum(){
        if(size == 0){
            return -1;// since the array is empty
        } else if (size == 1) {
            return arr[0];// there is only one element so whatever smallest or largest is it is ! (size=1 means index 0)
        }
        int smallest = arr[0];
        for( int i = 1; i<size; i++){
            if( arr[i] < smallest ){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    // method to return second smallest element in the array
    public int findSecondSmallestNum(){
        if(size <= 1){
            return -1;// since there is only one element or array is empty
        }
        int smallest1 = -1;
        int smallest2 = -1;
        if(arr[0] < arr[1]){
            smallest1 = arr[0];
            smallest2 = arr[1];
        }
        else{
            smallest1 = arr[1];
            smallest2 = arr[0];
        }
        for( int i = 2; i<size; i++){
            if( arr[i] < smallest1){
                smallest2 = smallest1;
                smallest1 = arr[i];
            } else if (arr[i] < smallest2) {
                smallest2 = arr[i];
            }
        }
        return smallest2;
    }
    // method to return second largest from an array...
    public int findSecondLargestNum(){
        if(size <= 1){
            return -1;// since there is only one element or array is empty
        }
        int Max1 = arr[1];
        int Max2 = arr[2];
        if(arr[0] > arr[1]){
            Max1 = arr[0];
            Max2 = arr[1];
        }
        else{
            Max1 = arr[1];
            Max2 = arr[0];
        }
        for( int i = 2; i<size; i++){
            if( arr[i] > Max1){
                Max2 = Max1;
                Max1 = arr[i];
            } else if (arr[i] > Max2) {
                Max2 = arr[i];
            }
        }
        return Max2;
    }
    // here is method to directly print one after one sorted element in ascending order
    public void sortAscending(){
        if(size <= 1){
            System.out.println("Invalid operation !");
            return;
        }
        for( int i = 0; i< size; i++){
            for( int j = i+1; j<size; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    // here is another method to directly print one after one sorted element in descending order
    public void sortDescending(){
        if(size <= 1){
            System.out.println("Invalid operation !");
            return;
        }
        for( int i = 0; i< size; i++){
            for( int j = i+1; j<size; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public int displayCurrentSize(){
        //System.out.println("Capacity used or current size of array : "+size);// we can also return value from method !\
        return getSize();
    }
    public int displayLengthArray(){
        //System.out.println("Length / Capacity of Array is : "+capacity);
        return getCapacity();
    }
}