package Hw4_18000949.Ex1;
//Tạo giao diện StackInterface kế thừa giao diện Iterable
public interface StackInterface<E> extends Iterable<E> {
    public void push(E element); //place item on top of the stack
    public E pop(); //remove item from the top of the stack
    public boolean isEmpty(); //Test whether the stack is empty
    public E top(); //Take a look at the topmost item without removing it
}
