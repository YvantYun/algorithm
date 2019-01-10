

public class LinkedListQueue<T> {
    private int N;
    private Node first; //指向最早添加的
    private Node last; //指向尾部
    private class Node{
        T t;
        Node next;
    }
    public LinkedListQueue(){
        first = new Node();
        last = new Node();
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void enqueue(T t){
        //进队，则向链表尾部添加元素
        Node oldLast = last;
        last = new Node();
        last.t = t;
        last.next = null;
        //判断是否是空队列
        if(isEmpty()){
            first = last;
        }else {
            oldLast.next = last;
        }
        N ++;
    }
    public T dequeue(){
        //从表头删除元素 ，类似出栈
        T t = first.t;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        N --;
        return t;
    }


}
