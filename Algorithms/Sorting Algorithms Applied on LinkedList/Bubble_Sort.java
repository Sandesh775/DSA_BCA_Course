import java.util.LinkedList;
public class Bubble_Sort {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println("Before sorting : ");
        System.out.println(list);
        Bubble(list);
        System.out.println("After sorting : ");
        System.out.println(list);
    }
    static void Bubble(LinkedList linkedlist){
        int size = linkedlist.size();
        boolean swapped = true;
        for(int i = 0; i<size-1 && swapped; i++){
            swapped = false;
            for( int j = 0; j<size-1-i; j++){
                int k = (int) linkedlist.get(j);
                int l = (int) linkedlist.get(j+1);
                if(k > l){
                    swapped = true;
                    linkedlist.set(j,l);
                    linkedlist.set(j+1,k);
                }
            }
        }
    }
}