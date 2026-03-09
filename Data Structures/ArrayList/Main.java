public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(4);
        list.add(10);
        list.add(15);
        list.add(25);
        System.out.println(list);
        System.out.println("Removed element : "+list.remove());
        System.out.println(list);
    }
}
