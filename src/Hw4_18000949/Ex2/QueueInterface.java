package Hw4_18000949.Ex2;

public interface QueueInterface<E> extends Iterable<E> {
    public void enqueue(E element); //add item to the back of the queue
    public E dequeue(); //remove item from the front of the queue
    public boolean isEmpty();
}
