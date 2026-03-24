package Question1_Count_Nodes;

public class Question1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertFirst(0);
        list.display();
        System.out.println("Number of nodes present in linked list getting count through function is : "+list.CountNodes());
        System.out.println("We can even count nodes as displayed in command line using display() above !?, does it make sense , it's true ? Does it match CountNodes() result ?");
    }
}