package Doubly_Linked_List;

public class Main {
    public static void main(String[] args) {
        Doubly_Linked_List list = new Doubly_Linked_List();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.display();
        list.displayReverse();
    }
}