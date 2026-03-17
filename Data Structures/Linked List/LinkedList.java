public class LinkedList {
    Node head;
    public void insertAtend( int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while( n.next_node_address != null){
                n = n.next_node_address;
            }
            n.next_node_address =  node;// cause newly made node default address is null as we know ?
        }
    }
    public void insertAtstart( int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            node.next_node_address = head;
        }
        head = node;
    }
    public void show(){
        Node node = head;
        while(node.next_node_address != null){
            System.out.print(node.data+" ");
            node = node.next_node_address;
        }
        System.out.println(node.data);
    }
}