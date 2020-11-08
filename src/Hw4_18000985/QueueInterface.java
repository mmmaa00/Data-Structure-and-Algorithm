package Hw4_18000985;


public interface QueueInterface<T> extends Iterable<T> {
public void enqueue(T element);
public T dequeue();
public boolean isEmpty();
}
