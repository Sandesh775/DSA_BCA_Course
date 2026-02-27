package Stack_Implementation_using_Array;

public class Implementing_Stack {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        boolean status;
        status = s.isEmpty();
        System.out.println("Now is stack empty : "+status);
        s.push(3);
        s.push(9);
        s.push(27);
        s.pop();
        int top_value = s.top();
        System.out.println("Right now element at the tos is : "+top_value);
        s.push(10);
        status = s.isFull();
        System.out.println("Now is stack full ? : "+status);
        s.push(19);
        s.pop();
        top_value = s.top();
        System.out.println("Right now element at the tos is : "+top_value);
        s.push(999);
        s.push(1000);
        status = s.isFull();
        System.out.println("Now is stack full ? : "+status);

    }
}
class Stack{
    int[] stack;
    int top;// pointer pointing towards the top of the stack
    int size; // here now it is total size of an array
    // note: Used size or current size can be track using top+1;
    Stack(){
        this.size = 5;
        stack = new int[size];
        top = -1;
    }
    Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    // Stack operations;
    public void push(int element){
        if(top+1 == size){
            System.out.println("Array is full !");
            return;
        }
        top++;// first increase the position index then set or insert value
        stack[top] = element;
    }
    public void pop(){// pop / delete last element, remove only
        if(top == -1){
            System.out.println("Array is empty !");
            return;
        }
        top--;// Simply moves the top pointer down
    }
//    public int pop() { //Remove AND return
//        if(top == -1) {
//            System.out.println("Array is empty !");
//            return -1;   // or throw exception
//        }
//        int data = stack[top];  // Get current top element FIRST
//        stack[top] = 0;         // Clear the slot (optional)
//        top--;                  // THEN decrement
//        return data;
//    }
    public int top(){//also peek() : get top data element of the stack, without removing it.
        if(top == -1){
            return -1;
        }
        return stack[top];
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){// method to show status if stack is empty or not
        return top == -1;
    }
    public boolean isFull(){// method to show status if stack is full or not
        return top+1 == size;// || return top == size-1;
    }
}
// Another version of code where i had tried to track stack with extra variable known as size = used sized , current stack
//class Stack{
//    int tos ; // it a variable pointing to the last or topmost element in a stack
//    int size; // also size = tos+1;  number of elements in a stack or shows the used sized of total capacity of stack
//    int[] arr ; // we will be going to implement a simple stack data structure using static array
//    int capacity;
//    //Default constructor
//    Stack(){
//        this.capacity = 10;
//        arr = new int[capacity];
//        tos = -1;// initializing tos to -1 as stack is empty so nowhere in index to point from 0 to Nth position
//        size = 0;// Obviously stack is empty so what will be the size of our stack ?, just count on the number of elements present in an array for now
//    }
//    Stack(int capacity){
//        this.capacity = capacity;
//        arr = new int[capacity];
//        // same reason here
//        tos = -1;
//        size = 0;
//    }
//    // Stack Operations :-)
//    public void push(int value){// method to insert new value next to the present top of the stack, or at the end, topmost position available
//        if(size == capacity){// if stack is full further can't be stored / inserted
//            System.out.println("Stack is Overflow !");
//            return;
//        }
//        arr[size] = value;
//        size++;// after insertion changing the number of element or size used
//        tos++;// changing the position of the top variable , pointing to newly added element index position as we know it always points to the last element or topmost element of stack
//    }
//    public void pop(){// method to remove or delete topmost element or last element from the stack
//        if(size == 0){
//            System.out.println("Stack is Underflow !");// empty stack doesn't have any element to delete from
//            return;
//        }
//        // here either we can set the last element to null value and the decrement tos and size
//        // or directly decrement them which automatically limits the range of stack
//        arr[tos] = 0;
//        tos--;
//        size--;
//    }
//    public boolean isEmpty(){// method to show status if stack is empty or not
//        return size == 0;// return tos == -1;
//    }
//    public boolean isFull(){// method to show status if stack is full or not
//        return size == capacity;// return tos == capacity-1; || return tos == size-1;
//    }
//    public int top(){// peek() - method to return/ retrieve the last element of stack
//        if(size == 0){//if(tos == -1)
//            return -1;// can only show last element if it is not empty !
//        }
//        return arr[tos];
//    }
//    public int size(){// display the size of stack , size = capacity used or number of elements in stack
//        return size;
//    }
////    public void displayStack(){
////        if(size == 0){
////            System.out.println("Stack is empty !");
////            return;
////        }
////        for(int i = 0; i<size; i++){// ( i <= tos ) only printing upto last element
////            System.out.print(arr[i]+" ");
////        }
////        System.out.println(" ");
////    }
//}