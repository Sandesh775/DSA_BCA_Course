package Queue_Implementation_Using_Array;

public class Circular_Queue {
    public static void main(String[] args) {

    }
}
class CircularQueue{
    private int[] a;
    private int capacity;
    private int currSize;
    private int front, rear;
    CircularQueue(int capacity){
        this.capacity = capacity;
        a = new int[capacity];
        currSize = 0; // number of elements
        front = 0;
        rear = 0;
    }
    public boolean enqueue(int value){
        if(isfull()){
            return  false;
        }
        a[rear] = value;
        rear = rear % a.length;
        currSize++;
        return true;
    }
    public int dequeue(){
        if(isempty()){
            return -1;
        }
        int removed = a[front];
        front = front % a.length;
        currSize--;
        return removed;
    }
    public void display(){
        for( int i = 0; i != rear;i++){
            if( i > a.length){
                i = i%a.length;
            }
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    public boolean isempty(){
        if(currSize == 0){
            return true;
        }
        return false;
    }
    public boolean isfull(){
        if(currSize == capacity){
            return true;
        }
        return false;
    }
}