package Doubly_Linked_List;

public class Main {
    public static void main(String[] args) {
        Doubly_Linked_List list = new Doubly_Linked_List();
        list.insertFirst(10);
        list.insertLast(49);
        list.insertLast(51);
        list.display();
        list.insertAt(1,48);
        list.display();
        System.out.println("Deleted last element : "+list.deleteLast());
        list.display();
        System.out.println("Deleted first element : "+list.deleteFirst());
        list.display();
    }
}