package Queue_Implementation_Using_Array;

public class Circular_Queue {
    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(5);
        c.display();
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        c.display();
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
        rear = (rear+1) % a.length;
        currSize++;
        return true;
    }
    public int dequeue(){
        if(isempty()){
            return -1;
        }
        int removed = a[front];
        front = (front+1) % a.length;
        currSize--;
        return removed;
    }
    public void display(){
        if(isempty()){
            System.out.println("Invalid operation");
            return;
        }
        int i = front;
        do{
            System.out.print(a[i]+" -> ");
//            i++;
//            i %= a.length;
              i = (i + 1) % a.length;
        }while (i != rear);
        System.out.println("END");
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