// Actually insertion sort is efficient with Linked list rather than Arrays
import java.util.LinkedList;
public class Insertion_Sort {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Before Sorting : ");
        System.out.println(list);
        insertionSort(list);
        System.out.println("After Sorting : ");
        System.out.println(list);
    }
    static void insertionSort(LinkedList<Integer> l){
        int size = l.size();
        for(int i = 1; i<size; i++){
            int key = l.get(i);
            int j = i-1;
            while (j>=0 && l.get(j)>key){
                l.set(j+1,l.get(j));
                j--;
            }
            l.set(j+1,key);
        }
    }
}