package ADT_implementation_in_JAVA;

public class ArrayADTextended {
    public static void main(String[] args) {
        MyArray2 a = new MyArray2(4);
        MyArray2 ref = a;// here ref is a reference variable for object a
//        a.push(1);
//        a.push(2);
//        a.push(3);
//        a.push(4);
        // so let's create an array of elements to be passed or stored or push
        int [] elements = new int[4];
        // then passed this array to push() method !
        a.push(elements);
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
            if(i <= size-1){
                arr[size] = elements[i];
                size++;
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
        int smallest = arr[0];
        for( int i = 1; i<size; i++){
            if( arr[i] < smallest ){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    // method to return second largest element in the array
    public int findSecondSmallestNum(){
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
    public int findSecondLargestNum(){
        int Max1 = 1;
        int Max2 = 2;
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
}