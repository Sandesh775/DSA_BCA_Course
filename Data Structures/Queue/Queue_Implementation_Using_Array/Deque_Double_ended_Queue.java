package Queue_Implementation_Using_Array;

public class Deque_Double_ended_Queue {
    public static void main(String[] args) {
        Deque d = new Deque(10);
        d.insertFront(90);

    }
}
class Deque{
    private int [] a;
    private int size ;
    private int capacity;
    private int front , rear;
    Deque(int capacity) {
        this.capacity = capacity;
        a = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }
    // Insert at front
    public boolean insertFront(int value) {
        if (isfull()) {
            System.out.println("Deque is full!");
            return false;
        }

        // Move front backward (circularly)
        front = (front - 1 + capacity) % capacity;
        a[front] = value;
        size++;

        // If this was first element, adjust rear
        if (size == 1) {
            rear = front;
        }
        return true;
    }
    public void pushrear(int value){
        if(isfull()){
            System.out.println("Invaliid operation !");
            return;
        }
        a[rear] = value;
        rear++;
        rear = rear%a.length;
        size++;
    }
    public int popfront(){
        if(isempty()){
            System.out.println("Invalid operation !");
            return -1;
        }
        int removed = a[front];
        front++;
        front = front%a.length;
        size--;
        return removed;
    }
    // Delete from rear
    public int deleteRear() {
        if (isempty()) {
            System.out.println("Deque is empty!");
            return -1;
        }

        int removed;

        // Case: Last element being removed
        if (size == 1) {
            removed = a[rear];  // or a[front] (they're the same)
            // Reset both pointers to initial state
            front = 0;
            rear = 0;
        } else {
            // Move rear backward to point to last element
            rear = (rear - 1 + capacity) % capacity;
            removed = a[rear];
        }

        size--;
        return removed;
    }
    public int getSize(){
        return size;
    }
    public boolean isfull(){
        return getSize() == a.length;
    }
    public boolean isempty(){
        return getSize() == 0;
    }
}