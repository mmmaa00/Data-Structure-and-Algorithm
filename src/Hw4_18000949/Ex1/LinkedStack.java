package Hw4_18000949.Ex1;
import java.util.Iterator;

public class LinkedStack<E> implements StackInterface<E> {
    class Node {
        E element;
        Node next;
        Node(E element){
            this.element = element;
        }
    }
    private Node stack = null;
   
    @Override
    public void push(E element) {
        //Thêm 1 phần tử vào stack
        Node newNode = new Node(element);
        if(stack == null)
            stack = newNode;
        else {
            Node temp = stack;
            stack = newNode;
            newNode.next = temp;
        }

    }

    @Override
    public E pop() {
        //Lấy một phần tử ra khỏi stack
        if(isEmpty())
            return null;
        else {
            E result = stack.element;
            stack = stack.next;
            return result;
        }   
    }

    @Override
    public boolean isEmpty() {
        //Kiểm tra stack rỗng
        return stack == null;
    }

    @Override
    public E top() {
        //Lấy giá trị phần tử đầu tiên của stack
        if(isEmpty())
            return null;
        return stack.element;   
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }
    class StackIterator implements Iterator<E> {
        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }
}
