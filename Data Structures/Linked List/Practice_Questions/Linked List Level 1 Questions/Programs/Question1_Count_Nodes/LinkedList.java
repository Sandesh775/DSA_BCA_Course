package Question1_Count_Nodes;

public class LinkedList {
    Node head;// head pointer to first node in linked list
    public int CountNodes(){
        if(head == null){
            return 0;// if list is empty return 0
        }
        int counter = 0;// setup counter for counting nodes encounter and which is not null !
        Node temp = head;
        while (temp != null){// to be sure we need to clarify that we are now counting node ie, objects
            // so when travers will end up temp reference pointer will be pointing to null
            counter++;
            temp = temp.next;
        }
        return counter;
    }
    public void insertFirst(int value){
        if(head == null){
            Node node = new Node(value);
            node.next = null;
            head = node;
            return;
        }
        Node node = new Node(value);
        // even if we don't assign node.next to null by default it will always null
        node.next = head;
        head = node;
    }
    public void insertLast(int value){
        if(head == null){
            Node node = new Node(value);
            node.next = null;
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(value);
        temp.next = node;
    }
    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("END");
    }
}