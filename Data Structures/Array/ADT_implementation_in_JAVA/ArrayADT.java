package ADT_implementation_in_JAVA;
public class ArrayADT{
    public static void main(String[] args) {
        MyArray a1 = new MyArray(5);
        a1.insert(1);
        a1.insert(2);
        a1.displayArray();
        a1.delete();
        a1.displayArray();
        a1.insertAt(4,5);
        a1.insert(1);
        a1.insert(2);
        a1.displayArray();
        a1.insertAt(0,5);
        a1.displayArray();
        a1.insertAt(3,4);
        a1.displayArray();
        a1.deleteAt(4);
        a1.displayArray();
        a1.insertAt(4,4);
        a1.displayArray();
    }
}
class MyArray{
    // making instance variables privates encapsulating
    private int [] arr;
    private int capacity;// max size of array
    private int size;// represent used size of array or
    // we can also say it represents the total number elements present in an array, not the index !!!!
    // constructor
    MyArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0; // size set to when any new array is created or object
    }
    // here are some operations declared to be performed
    public void displayArray(){
        for( int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public int getElement(int index){
        if(index < 0 || index > size-1 ){
            return -1;
        }
        return arr[index];
    }
    public int searchElement(int value){
        for( int i = 0; i<size; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    // insert value at the end
    public void insert(int value){
        if(size == capacity){
            System.out.println("Array is full !");
            return;
        }
        arr[size] = value;
        size++;
    }
    // delete elements from end
    public void delete(){
        if(size == 0){
            System.out.println("Array is empty !");
            return;
        }
        arr[size-1] = 0;
        size--;
    }
    // insert element at specific index
    public void insertAt(int index, int value){
        if(index < 0 || index > size || size==capacity){//Insertion allowed at index <= size
            System.out.println("Invalid operation !");
            return;
        }
        for(int i = size; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        size++;
    }
    // delete at specific index
    public void deleteAt(int index){
        if(index < 0 || index > size-1 || size==0){
            System.out.println("Invalid operation !");
            return;
        }
        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
    }
}
/*
*
Notice:
Access → < size
Insert → <= size
* Insertion :
* Shift RIGHT (start from size → go down)
* Deletion  :
* Shift LEFT (start from index → go up)
* */