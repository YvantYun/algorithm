package stack;


public class LinkedListStack<T> {
    private int N;
    private Node first;
    private class Node{
        T t;
        Node next;
    }
    public LinkedListStack(){
        first = new Node();
    }
    //压栈 添加一个first 将值赋给first
    public void push(T t){
        Node oldFirst = first;
        first = new Node();
        first.next = oldFirst;
        first.t = t;
        N++;
    }

    public T pop(){
        T t = first.t;
        first = first.next;
        N --;
        return t;
    }

    public boolean isEmpty(){
        return N ==0;
    }

    //返回顶元素
    public T peek(){
        return first.t;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(first.t);
        for(Node node = first.next; node!=null; node = node.next){
            res.append("->").append(node.t);
        }
        return res.toString();
    }
}
