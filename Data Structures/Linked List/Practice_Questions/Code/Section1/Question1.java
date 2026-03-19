package Section1;
/*
Question 1: Count Nodes
Write a method public int size() that returns the total number of nodes in the linked list.
* */
public class Question1 {
    public static void main(String[] args) {
        // Build a linked list manually (raw way)

        // Create nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        // Connect nodes manually
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Head points to first node
        Node head = node1;

        // Now count nodes
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            System.out.println("Node " + count + ": " + current.data);
            current = current.next;
        }

        System.out.println("Total nodes: " + count);
    }
}
/*
* public int countNodes() {
    int count = 0;
    Node current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}
* */