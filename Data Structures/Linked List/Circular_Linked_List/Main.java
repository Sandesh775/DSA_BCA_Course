package Circular_Linked_List;

public class Main {
    public static void main(String[] args) {
        Circular_Singly_Linked_List list = new Circular_Singly_Linked_List();
        list.insert(10);
        list.insert(11);
        list.insert(15);
        list.insert(90);
        list.insert(23);
        list.display();
        list.delete(10);
        list.display();
        list.delete(23);
        list.display();
        list.delete(15);
        list.display();
    }
}