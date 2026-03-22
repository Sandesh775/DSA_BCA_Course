package LinkedList_Demo;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(1);
        list.insertLast(23);
        list.insert(1,100);
        list.display();
        list.insertFirst(500);
        list.display();
        System.out.println("Removed last one : "+list.deleteLast());
        list.display();
        System.out.println("Removed first one : "+list.deleteFirst());
        list.display();
    }
}