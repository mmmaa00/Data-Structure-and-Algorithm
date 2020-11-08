package Hw4_18000949.Ex2;
import java.util.Iterator;


public class LinkedQueue<E> implements QueueInterface<E> {
    class Node {
        E element;
        Node next;
        Node(E element){
            this.element = element;
        }
    }
    private Node top = null;
    private Node bot = null;

    public LinkedQueue(){
    }

    @Override
    public boolean isEmpty() {
        return top == null; 
    }

    @Override
    public void enqueue(E element) {
        Node newNode = new Node(element);
        if(isEmpty()) {
            top = newNode;
        }
        else {
            bot.next = newNode;
        }
        bot = newNode;
    }

    @Override
    public E dequeue() {
        if(isEmpty())
            return null;
        else {
            E result = top.element;
            top = top.next;
            return result;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedQueueIterator();
    }
    
    class LinkedQueueIterator implements Iterator<E> {
        private Node currentNode = top;

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
