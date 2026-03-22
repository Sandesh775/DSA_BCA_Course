package Doubly_Linked_List;

public class Node {
    Node prev_node;
    int value;
    Node next_node;
    Node(int value){
        this.value = value;
    }
    Node(Node prev_node, int value, Node next_node){
        this.prev_node = prev_node;
        this.value = value;
        this.next_node = next_node;
    }
}
