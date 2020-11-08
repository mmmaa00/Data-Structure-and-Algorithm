package Hw4_18000985;
import java.util.Iterator;

public interface StackInterface<T> extends Iterable<T> {
public void push(T element);
public T pop();
public boolean isEmpty();
public T top();
}
