package LinkedList_Demo;

public class LinkedList {
    Node head;// we have head pointer
    Node tail;// we have tail pointer
    int size; // we have size
    LinkedList(){
        size = 0;
    }
    public Node get(int index){
        if (index < 0 || index >= size) return null;
        Node node = head;
        for( int i = 0; i<index; i++){
            node = node.next;
        }
        return node;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.data == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;// newly created node should point to the current head
        head = node; // now we should shift head pointer to new node
        if(tail == null){
            tail = head;
        }
        size++;// count element
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;// count element
    }
    public void insert(int index,int value){
        if(index == 0){// index < 1
            insertFirst(value);
            return;
        }
        if(index == size){// inserting at last
            insertLast(value);
            return;
        }
        Node temp = head;
        for( int i = 1; i<index; i++){
            temp = temp.next;
        }
        // after loop stopped , now pointer temp will reach behind the index we want to insert
        // then :
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = head;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.data;
        //secondLast.next = null;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int deleteAt( int index){
        if( index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index - 1);      // Node before target
        Node temp = prev.next;            // temp points to target node (the one to delete)
        int val = temp.data;              // Store value to return

        prev.next = temp.next;            // Skip the target node
        // OR: prev.next = temp.next;     // Same as prev.next = prev.next.next
//        Node prev = get(index-1);
//        int val = prev.next.data;
//        prev.next = prev.next.next;
//        return val;
        size--;
        return val;
    }
}