package Queue_Implementation_Using_Array;

public class Implementing_Queue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(4);
        queue.enqueue(90);
        queue.enqueue(18);
        queue.show();
        queue.dequeue();
        queue.show();
    }
}
// here i understand that while dequeue we can shift elements at left,
// and doing so allows us to have front pointer constant arr[0] so no need of pointer
// and another thing i haven't used size as used size but as capacity, but we can do with that too
// and for alternative i have commented that code too in the end !
// we can initialize in 3 approaches like front = rear  = 0 || front = rear = -1 || front = 0 rear = -1
class Queue{
    private int [] arr;
    private int size;
    private int front;// track the end where elements are being removed , or track first element in queue
    private int rear;// track the end of the queue where elements are being inserted, or track the last element in queue
    // default constructor
    Queue(){
        this.size = 10;// default size
        arr = new int[size];
        front = 0;// both pointing to same position while queue is empty
        rear = 0;
    }
    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = 0;// we can alos initialize them in -1 index too
        rear = 0;// if we initialize from -1 , we always would first increment then insert, but when it is initialize
        // from 0 then first we can insert and do increment
    }
    // operations
    public void enqueue(int data){
        if(rear == size-1){
            System.out.println("Queue is full !");
            return;
        }
        arr[rear] = data;// also arr[rear++] = data;
        rear++;
    }
    // whenever something is removed from any data structure you return
    // or display the item that is removed.
//    public int dequeue(){
//        if(rear == 0){
//            System.out.println("Queue is empty !");
//            return -1;
//        }
//        int removed  = arr[front];
//        front++;
//        return removed;
//    }
    public int dequeue(){
        if( rear == 0){// rear always equals the number of elements, When you dequeue all, rear becomes 0
            System.out.println("queue is empty !");
            return -1;
        }
        int removed = arr[front];// int removed = arr[0];
        for( int i = 1; i<rear; i++){// shift elements to the left, if we do shifting then we say front always points to index : 0, maybe no need pointer for front
            arr[i-1] = arr[i];
        }
        rear--;
        return removed;
    }
    public boolean isfull(){
        if(rear == size-1){
            return true;
        }
        return false;
    }
    public boolean isempty(){
        if(front == rear){
            return true;
        }
        return false;
    }
    public int front(){
        if(rear == 0){
            return -1;
        }
        return arr[front];
    }
    // or if we follow shifting while dequeue we can simply pass arr[0] cause it is always the front ?
//    public int front(){
//        if(rear == 0){
//            return -1;
//        }
//        return arr[0];
//    }
    public void show(){
        for( int i = 0; i<rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
// here also if we follow display thing also be completely different
//public void show(){
//    for( int i = front; i<rear; i++){
//        System.out.print(arr[i]+" ");
//    }
//    System.out.println(" ");
//}
}
/*Here is a alternative one for further understanding :
public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        // Test enqueue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();  // [10, 20, 30, 40, 50]

        // Try to enqueue when full
        q.enqueue(60);  // Should print "Queue is full!"

        // Test dequeue
        System.out.println("Dequeued: " + q.dequeue());  // 10
        System.out.println("Dequeued: " + q.dequeue());  // 20
        q.display();  // [30, 40, 50]

        // Test front and rear values
        q.displayStatus();

        // Add more after dequeuing
        q.enqueue(60);
        q.enqueue(70);
        q.display();  // [30, 40, 50, 60, 70]

        // Empty the queue
        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }
        q.display();  // Empty
        q.displayStatus();

        // Test dequeue on empty queue
        q.dequeue();  // Should print "Queue is empty!"
    }
}

class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;    // Points to first element
        rear = 0;     // Points to NEXT insertion position
        size = 0;     // Tracks current number of elements
    }

    // Enqueue - add element at rear
    public void enqueue(int value) {
        // Edge Case 1: Queue is full
        if (size == capacity) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return;
        }

        arr[rear] = value;           // Insert at current rear position
        rear++;                       // Move rear to next position
        size++;                       // Increment size

        System.out.println("Enqueued: " + value);
    }

    // Dequeue - remove and return element from front
    public int dequeue() {
        // Edge Case 1: Queue is empty
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue");
            return -1;
        }

        int removed = arr[front];     // Get front element
        arr[front] = 0;               // Optional: clear the slot
        front++;                       // Move front pointer forward
        size--;                       // Decrement size

        // Edge Case 2: Queue becomes empty after dequeue
        if (size == 0) {
            // Reset pointers to initial state (optional but clean)
            front = 0;
            rear = 0;
            System.out.println("Queue is now empty - pointers reset");
        }

        return removed;
    }

    // Peek - view front element without removing
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get current size
    public int getSize() {
        return size;
    }

    // Display all elements
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[front + i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Display internal state (for learning/debugging)
    public void displayStatus() {
        System.out.println("=== Queue Status ===");
        System.out.println("Front pointer: " + front);
        System.out.println("Rear pointer: " + rear);
        System.out.println("Size: " + size);
        System.out.println("Capacity: " + capacity);
        System.out.print("Array content: [");
        for (int i = 0; i < capacity; i++) {
            System.out.print(arr[i]);
            if (i < capacity - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("===================");
    }
}
* */