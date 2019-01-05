package linked;

public class SingleLinkedList<E> {
    //定义节点类 内部类形式 :每一个节点 存数据 next指向下一个节点
    private class Node{
        private E e;
        private Node next;
        //构造，head传入null
        public Node(E e) {
            this.e = e;
            next = null;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    //链表
    private int size;
    private Node head; //节点类第一个
    //构造
    public SingleLinkedList(){
        size = 0;
        head = null;
    }

    //在链表头添加元素,返回应该是一个链表
    public Node addFirst(E e){
        Node newHead = new Node(e);
        if(size == 0){
            newHead = head;
        }else {
            newHead.next = head;
            head = newHead;
        }
        size ++;
        return newHead;

    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = head;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
