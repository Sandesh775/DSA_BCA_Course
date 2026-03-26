// Generally and mostly Selection sorting is efficient for Array
import java.util.LinkedList;
public class Selection_Sort {
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
        selectionSort(list);
        System.out.println("After Sorting : ");
        System.out.println(list);
    }
    static void selectionSort(LinkedList<Integer> l){
        int size = l.size();
        for(int i = size-1; i>0; i--){
            int maxIndex = 0;
            int max = l.get(0);
            for(int j = 1; j<=i; j++){
                if(l.get(j)> max){
                    maxIndex = j;
                    max = l.get(j);
                }
            }
            l.set(maxIndex,l.get(i));
            l.set(i,max);
        }
    }
}