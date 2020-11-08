package Hw4_18000949.Ex1;
import java.util.Iterator;

public class ArrayStack<E> implements StackInterface<E> {
    public static int defaultSize = 1000; 
    private E[] array;
    int top = -1; //biến đánh dấu vị trí đỉnh của ngăn xếp
    public ArrayStack() {
        array = (E[]) new Object[defaultSize];
    }
    public ArrayStack(int capacity) {
        array = (E[]) new Object[capacity];
    }
    public int size() {
        return top + 1 ;
    }

    @Override
    public void push(E element) {
        if(top == array.length - 1)
            System.out.println("Error: Overflow!");
        array[++top] = element;
    }

    @Override
    public E top() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return array[top];
        
    }

    @Override
    public boolean isEmpty() {
        return top == -1 ;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else {
            E result = array[top];
            array[top] = null;
            top--;
            return result;
        }
    }
    
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                if(index < array.length && array[index] != null)
					return true;
                return false;
            }

            @Override
			public E next() {
                // TODO Auto-generated method stub
                if(hasNext())
                    return array[index++];
                return null;
			}
        };
    }
}
