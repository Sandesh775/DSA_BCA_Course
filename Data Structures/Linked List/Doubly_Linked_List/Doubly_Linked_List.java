package Doubly_Linked_List;

public class Doubly_Linked_List {
    Node head;
//    Node tail;
//    int size;
    Doubly_Linked_List(){
        //size = 0;
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