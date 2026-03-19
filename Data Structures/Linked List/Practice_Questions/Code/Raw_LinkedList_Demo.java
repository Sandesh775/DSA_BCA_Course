public class Raw_LinkedList_Demo {
        public static void main(String[] args) {

            Node node1 = new Node();// Step 1: Create blank nodes (just allocate memory)
            node1.data = 10;// Step 2: Assign values directly (no constructor)
            Node node2 = new Node();
            node1.next = node2;// Step 3: Connect nodes manually

            Node node3 = new Node();
            Node node4 = new Node();


            node2.data = 20;
            node3.data = 30;
            node4.data = 40;


            node2.next = node3;
            node3.next = node4;
            node4.next = null;  // Last node points to nothing


            Node head = node1;// Step 4: Assign head, Head points to first node

            // Step 5: Traverse and see what we built
            System.out.println("My linked list:");
            Node current = head;// here current holds the address of actual object not the next address as value
            while (current != null) {
                System.out.println("Node with data: " + current.data);
                current = current.next;//Get next address from node
            }
        }
    }