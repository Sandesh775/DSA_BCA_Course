package Queue_Implementation_Using_Array;
import java.util.Queue;
import java.util.LinkedList;
public class GenericQueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements (enqueue)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Queue: " + queue);

        // Removing element (dequeue)
        int removed = queue.poll();
        System.out.println("Removed: " + removed);

        // See front element
        int front = queue.peek();
        System.out.println("Front now: " + front);

        System.out.println("Queue now: " + queue);
    }
}