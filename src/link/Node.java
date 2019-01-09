package link;

public class Node<T> {
    public T t;
    public Node<T> next;

    public Node() {
        this.t = null;
    }

    public Node nextNode (Node node){
        return node.next;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(t);
        for(Node node = next;node!=null; node = node.next){
            res.append("->").append(node.t);
        }
        return res.toString();
    }
}
