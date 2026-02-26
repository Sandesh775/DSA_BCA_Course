package ADT_implementation_in_JAVA;
public class DynamicArrayUsingStaticArrayDemo {
    public static void main(String[] args) {
        DynamicArray ar = new DynamicArray(5);
        ar.insert(1);
        ar.insert(2);
        ar.insert(3);
        ar.insert(4);
        ar.insert(5);
        ar.add(6);
        for (int i = 0; i < ar.size(); i++){
            int value = ar.get(i);
            System.out.print(value+" ");
        }
    }
}
class DynamicArray{
    private int[] arr ;// as we can see this is fixed sized static array where
    // we can can't further insert out 6th element , and also it doesn't shrink in if
    // some elements were removed it's size is constant from as it were created
    // so for making process dynamic we create new array with the twice size of this array
    private int capacity;// actual size of array
    private int len = 0;// length user thinks array is
    // constructor
    DynamicArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        // len is already set to 0
    }
    DynamicArray(){
        this.capacity = 10;
        arr = new int[capacity];
    }
    public int size(){// method to return the size of an array used , current size
        return len;
    }
    public boolean isEmpty(){// method to check or return the status of array either it is empty or not
        if(size() == 0){
            return true;
        }
        return false;
    }
//    public int get(int index){
//        if(index < 0 || index >= capacity || index >= len || len==0){
//            System.out.println("Invalid operation !");
//            return -1;
//        }
//        return arr[index];
//    }
    public void set(int index, int elem){
        if(index < 0 || index < len+1 || len == capacity){
            System.out.println("Invalid operation !");
            return;
        }
        arr[index] = elem;
    }
    // insert/add value at the end
    public void insert(int value){
        if(len == capacity){
            System.out.println("Array is full !");
            return;
        }
        arr[len] = value;
        len++;
    }
    public int get(int index) {
        return arr[index];
    }
    public void clear(){ // method to clear all elements from array
        for(int i = 0; i<capacity; i++){
            arr[i] = 0;
        }
        len = 0;
    }
    public void add(int elem){
        if(len+1 >= capacity){
            if(capacity == 0){
                capacity = 1;
            }
            else{
                capacity = 2*capacity;// double the size of an array
            }
            int[] new_arr = new int[capacity];
            for(int i = 0; i< len; i++){
                new_arr[i] = arr[i];
            }
        }
        arr[len+1] = elem;
    }
    public void removeAt(int index){
        if(index < 0 || index >= len || len == 0){
            System.out.println("Invalid operation !");
            return;
        }
        for( int i = index; i<len; i++){
            arr[i] = arr[i+1];
        }
        len--;
    }
    public boolean remove(int elem){
        for( int i = 0; i<len; i++){
            if(arr[i] ==elem){
                removeAt(i);
                return true;
            }
        }
        return false;
    }
    public int indexOf(int elem){
        for( int i = 0; i<len; i++){
            if(arr[i] == elem){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(int elem){
        return indexOf(elem) != -1;
    }
}