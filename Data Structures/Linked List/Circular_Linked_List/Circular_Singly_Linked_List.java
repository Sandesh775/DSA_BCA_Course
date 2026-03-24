package Circular_Linked_List;

public class Circular_Singly_Linked_List {
    Node head;
    Node tail;
    Circular_Singly_Linked_List(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int value){
        if(head == null){
            Node node = new Node(value);
            head = node;
            tail = head;// tail = node;
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.data+" -> ");
                node = node.next;
            }while (node != head);
            System.out.println("HEAD");
        }
    }
    public void delete(int value){
        Node node = head;
        if( node == null){
            return;
        }
        if( node.data == value){
            head = head.next;
            tail.next = head;
            return;
        }
        Node node2 = tail;
        if(node2.data == value){
            Node n = head;
            while (n.next != tail){
                n = n.next;
            }
            n.next = head;
            tail = n;
            return;
        }
        do{
            Node n = node.next;
            if(n.data == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }
//    public void display(){
//        Node node = head;
//        while (node != tail){
//            System.out.print(node.data+" -> ");
//            node = node.next;
//        }
//        System.out.print(node.data+" -> ");
//        System.out.println("END");
//    }
}