package link;

public class Main {


    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node last = new Node();
        first.t = "one";
        second.t = "two";
        last.t = "three";
        first.next = second;
        second.next = last;
        System.out.println(first);

        //在表头插入数据
        Node oldFirst = first;
        first = new Node();
        first.t = "not";
        first.next = oldFirst;
        System.out.println(first);
        first = first.next;
        System.out.println(first);
        //表尾插入数据

        Node oldlast = last;
        last =new Node();
        oldlast.next = last;

        System.out.println(first);


    }
}
