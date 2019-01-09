package link;

public class Main {


    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node last = new Node();
        first.t = "to";
        second.t = "be";
        last.t = "or";
        first.next = second;
        second.next = last;

        //在表头插入数据
        Node oldFirst = first;
        first = new Node();
        first.next = oldFirst;

        //表尾插入数据

        Node oldlast = last;
        last =new Node();
        oldlast.next = last;

        System.out.println(first);


    }
}
