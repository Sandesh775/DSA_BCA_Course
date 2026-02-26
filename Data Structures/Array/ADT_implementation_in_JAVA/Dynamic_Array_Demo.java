package ADT_implementation_in_JAVA;

public class Dynamic_Array_Demo {
    public static void main(String[] args) {
        Dynamic_Array arr1 = new Dynamic_Array(5);
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.displayArray();
        arr1.add(6);
        arr1.displayArray();
        System.out.println("Capacity : "+arr1.capacity+" Size : "+arr1.size);
        arr1.delete(6);
        arr1.deleteAt(0);
        arr1.displayArray();
        System.out.println("Capacity : "+arr1.capacity+" Size : "+arr1.size);
    }
}
class Dynamic_Array{
    int [] arr;
    int capacity;
    int size;
    Dynamic_Array(){
        this.capacity = 10;
        arr = new int[capacity];
        size = 0;// number of elements
    }
    Dynamic_Array(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }
    public void grow() {
        int newcapacity = capacity * 2;     // Double the capacity
        int[] new_arr = new int[newcapacity]; // New static array
        for(int i = 0; i < size; i++) {      // Copy existing elements
            new_arr[i] = arr[i];
        }
        capacity = newcapacity;               // Update capacity
        arr = new_arr;                         // Replace old array
    }
    public int get(int index) {
        return arr[index];
    }
//    public void add(int value){
//        if(size >= capacity){
//            grow();
//            arr[size] = value;
//            size++;
//        }
////        if(size == capacity){
////            System.out.println("Array is full !");
////            return;
////        }
//        else {
//            arr[size] = value;
//            size++;
//        }
//    }
    public void add(int value) {
        if(size >= capacity) {  // Array is full
            grow();              // Create larger array
            arr[size] = value;   // Add new element
            size++;
        } else {
            arr[size] = value;   // Just add if space exists
            size++;
        }
    }
    public void insert(int index, int value){
        if(size >= capacity && index > 0){// Grow if needed
            grow();
            for( int i = size; i>index; i--){// Shift right
                arr[i] = arr[i-1];
            }
            arr[index] = value;
            size++;
        }
//        if(index < 0 || index >= capacity || size==capacity || index >= size+1){
//            System.out.println("Invalid operation !");
//            return;
//        }
        for( int i = size; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        size++;
    }
//    public void deleteAt(int index){
//        if(size == 0){
//            System.out.println("Array is empty !");
//            return;
//        }
//        for( int i = index;i < size ; i++){
//            arr[i] = arr[i+1];
//        }
//        size--;
//        if(size <= capacity/2){
//            shrink();
//        }
//    }
public void deleteAt(int index){
    if(size == 0){
        System.out.println("Array is empty !");
        return;
    }
    if(index < 0 || index >= size){  // Add index validation
        System.out.println("Invalid index !");
        return;
    }
    for(int i = index; i < size - 1; i++){  //  Stop at size-2
        arr[i] = arr[i+1];
    }
    arr[size - 1] = 0;  //  Optional: clear the last slot
    size--;

    if(size <= capacity/2 && capacity > 1){  //  Prevent shrinking to zero
        shrink();
    }
}
    public void delete( int value){
        if(size == 0){
            System.out.println("Array is empty !");
            return;
        }
        int index = search(value);
        for( int i = index;i < size ; i++){
            arr[i] = arr[i+1];
        }
        size--;
        if(size <= capacity/2){
            shrink();
        }
    }
    public int search(int value){
        for( int i = 0; i<size; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    public void shrink() {
        int newcapacity = capacity / 2;       // Halve the capacity
        int[] new_arr = new int[newcapacity]; // New smaller array
        for(int i = 0; i < size; i++) {       // Copy only used elements
            new_arr[i] = arr[i];
        }
        capacity = newcapacity;
        arr = new_arr;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void displayArray(){
        for( int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
}