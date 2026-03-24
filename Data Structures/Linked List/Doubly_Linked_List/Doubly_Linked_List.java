package Doubly_Linked_List;

import javax.management.StandardEmitterMBean;

public class Doubly_Linked_List {
    Node head;
//    Node tail;
//    int size;
    Doubly_Linked_List(){
        //size = 0;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next_node;
        }
        return temp;
    }
    public Node find(int value){
        Node node = head;
        while (node != null ){
            if(node.value == value){
                return node;
            }
            node = node.next_node;
        }
        return null;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.prev_node = null;
        node.next_node = head;
        if(head != null){
            head.prev_node = node;
        }
        head = node;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(head == null){
            node.prev_node = null;
            head = node;
            return;
        }
        Node last = head;
        while( last.next_node != null){
            last = last.next_node;
        }
        last.next_node = node;
        node.prev_node = last;
        node.next_node = null;
    }
    public void insertAfter(int after, int value){
        Node temp = find(after);
        if(temp == null){
            System.out.println("Node doesn't exist !");
            return;
        }
        Node node = new Node(value);
        node.prev_node = temp;
        node.next_node = temp.next_node;
        temp.next_node = node;
        if(node.next_node != null) {
            node.next_node.prev_node = node;
        }
    }
    public void insertAt(int index,int value){// also insertBefore
        if(index == 0){
            insertFirst(value);
            return;
        }
        Node next = get(index);
        Node node = new Node(value);
        node.next_node = next;
        node.prev_node = next.prev_node;
        next.prev_node = node;
        if(node.prev_node != null) {
            node.prev_node.next_node = node;
        }
    }
    public void display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next_node;
        }
        System.out.println("END");
    }
    public void displayReverse(){
        Node temp1 = head;
        Node temp2 = null;
        while( temp1 != null){
            temp2 = temp1;
            temp1 = temp1.next_node;
        }
        while (temp2 != null){
            System.out.print(temp2.value+" -> ");
            temp2 = temp2.prev_node;
        }
        System.out.println("END");
    }
    public int deleteLast(){
        Node temp = head;
        while(temp.next_node != null){
            temp = temp.next_node;
        }
        int val = temp.value;
        if(temp.prev_node != null) {
            temp.prev_node.next_node = null;
        }
        temp.prev_node = null;
        return val;
    }
    public int deleteFirst(){
        if(head == null){
            System.out.println("List is empty !");
            return -1;
        }
        Node temp = head;
        int val = temp.value;
        temp.next_node.prev_node = null;
        head = temp.next_node;
        temp.next_node = null;
        return val;
    }
    // display reverse if we use of tail pointer
//    public void display(){
//        Node temp = tail;
//        while( temp != null){
//            System.out.print(temp.value+" -> ");
//            temp = temp.prev_node;
//        }
//        System.out.println("END");
//    }
}