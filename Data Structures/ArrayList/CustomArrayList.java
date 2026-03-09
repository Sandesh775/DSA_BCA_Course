import java.util.Arrays;

public class CustomArrayList {
    private int [] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;// number of elements
    CustomArrayList(){
        this.arr = new int[DEFAULT_SIZE];
    }
    CustomArrayList(int capacity){
        this.arr = new int[capacity];
    }
    public boolean isFull(){
        return size == arr.length; //size == DEFAULT_SIZE;//
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void add(int data){
        if(isFull()){
            resize();
        }
        arr[size] = data;// in one line arr[size++] = data;
        size++;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Invalid operation");
            return -1;
        }
        int removed = arr[size-1];
        size--;
        arr[size] = 0;
        return removed;
    }
    public int get(int index){
        return arr[index];
    }
    public int getSize(){
        return size;
    }
    public void resize(){
        int[] arr2 = new int[arr.length*2];//new int[DEFAULT_SIZE*2];
        for( int i = 0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}