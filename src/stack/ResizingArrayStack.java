package stack;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T> {
    private T[] a = (T[]) new Object[1]; //存放T
    private int size = 0; //栈的大小

    public boolean isEmpty(){
        return size == 0;
    }

    private void resize(int max){
        T[] temp = (T[]) new Object[max];
        for(int i = 0 ; i < size; i++){
            temp[i]=a[i];
        }
        a = temp;
    }

    public void push(T t){
        if(size == a.length){
            resize(2 * a.length);
        }
        a[size ++] = t;
    }

    public T pop(){
        T t = a[size - 1];
        size --;
        a[size] = null;
        if(size > 0 && size == a.length/4){
            resize(a.length/2);
        }
        return t;
    }


    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements  Iterator<T>{
        private int i = size;
        public boolean hasNext(){
            return i > 0;
        }
        public  T next(){
            size --;
            return a[size];
        }
        public void remove(){}
    }
}
