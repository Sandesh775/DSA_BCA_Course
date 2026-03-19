package Singly_Linked_List;

public class LinkedList {
    Node head;
    public void insertAtend( int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while( n.next_node_address != null){
                n = n.next_node_address;
            }
            n.next_node_address =  node;// cause newly made node default address is null as we know ?
        }
    }
    public void insertAtstart( int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            node.next_node_address = head;
        }
        head = node;
    }
    public void insertAtanyPosition(int index, int value) {
        Node node = new Node(value);

        // Case 1: Empty list
        if (head == null) {
            if (index == 0) {
                head = node;  // Only valid case
                return;
            } else {
                System.out.println("List empty! Can only insert at index 0");
                return;
            }
        }

        // Case 2: Insert at beginning
        if (index == 0) {
            insertAtstart(value);
            return;
        }

        // Case 3: Insert at other positions
        Node current = head;

        // Traverse to node before target
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Index out of bounds");
                return;
            }
            current = current.next_node_address;
        }

        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }

        node.next_node_address = current.next_node_address;
        current.next_node_address = node;
    }
    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node
        if (head.next_node_address == null) {
            head = null;
            return;
        }

        Node current = head;
        // Traverse to second-last node
        while (current.next_node_address.next_node_address != null) {
            current = current.next_node_address;
        }

        // Remove last node
        current.next_node_address = null;
    }

    // Delete at specific index (0-based)
    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node (index 0)
        if (index == 0) {
            head = head.next_node_address;
            return;
        }

        Node current = head;
        // Traverse to node just before the target index
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next_node_address == null) {
                System.out.println("Index out of bounds");
                return;
            }
            current = current.next_node_address;
        }

        // Check if next node exists
        if (current.next_node_address == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Skip the target node
        current.next_node_address = current.next_node_address.next_node_address;
    }
    public void show(){
        Node node = head;
        while(node.next_node_address != null){
            System.out.print(node.data+" ");
            node = node.next_node_address;
        }
        System.out.println(node.data);
    }
}