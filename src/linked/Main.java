package linked;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
        for(int i = 0; i < 5 ; i ++){
            linkedList.addFirst(i);
        }
        linkedList.addFirst(234);
        System.out.println(linkedList);
    }
}
