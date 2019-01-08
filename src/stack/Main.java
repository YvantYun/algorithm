package stack;

public class Main {
    public static void main(String[] args) {
        ResizingArrayStack<Integer> integers = new ResizingArrayStack<>();
        for(int i = 0 ; i < 10 ; i++ ){
            integers.push(i);
        }
       integers.pop();
       while (integers.iterator().hasNext()){
           int a = integers.iterator().next();
           System.out.print(a);
       }
    }
}
