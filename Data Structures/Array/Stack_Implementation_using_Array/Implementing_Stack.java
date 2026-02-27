package Stack_Implementation_using_Array;

public class Implementing_Stack {
    public static void main(String[] args) {

    }
}
class Stack{
    int tos ; // it a variable pointing to the last or topmost element in a stack
    int size; // number of elements in a stack or shows the used sized of total capacity of stack
    int[] arr ; // we will be going to implement a simple stack data structure using static array
    int capacity;
    //Default constructor
    Stack(){
        this.capacity = 10;
        arr = new int[capacity];
        tos = -1;// initializing tos to -1 as stack is empty so nowhere in index to point from 0 to Nth position
        size = 0;// Obviously stack is empty so what will be the size of our stack ?, just count on the number of elements present in an array for now
    }
    Stack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        // same reason here
        tos = -1;
        size = 0;
    }
    // Stack Operations :-)
    public void push(int value){// method to insert new value next to the present top of the stack, or at the end, topmost position available
        if(size == capacity){// if stack is full further can't be stored / inserted
            System.out.println("Stack is Overflow !");
            return;
        }
        arr[size] = value;
        size++;// after insertion changing the number of element or size used
        tos++;// changing the position of the top variable , pointing to newly added element index position as we know it always points to the last element or topmost element of stack
    }
    public void pop(){// method to remove or delete topmost element or last element from the stack
        if(size == 0){
            System.out.println("Stack is Underflow !");// empty stack doesn't have any element to delete from
            return;
        }
        // here either we can set the last element to null value and the decrement tos and size
        // or directly decrement them which automatically limits the range of stack
        arr[tos] = 0;
        tos--;
        size--;
    }
    public boolean isEmpty(){
        return size == 0;// return tos == -1;
    }
    public boolean isFull(){
        return size == capacity;// return tos == capacity-1; || return tos == size-1;
    }
    public int top(){// peek() - method to return the last element of stack
        if(size == 0){//if(tos == -1)
            return -1;// can only show last element if it is not empty !
        }
        return arr[tos];
    }
    public int size(){
        return size;
    }
    public void displayStack(){
        if(size == 0){
            System.out.println("Stack is empty !");
            return;
        }
        for(int i = 0; i<size; i++){// ( i <= tos ) only printing upto last element
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}