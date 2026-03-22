package LinkedList_Demo;

public class Node {
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){// by default the value of reference variable is null
        this.data = data;
        // this.next = null;
    }
}