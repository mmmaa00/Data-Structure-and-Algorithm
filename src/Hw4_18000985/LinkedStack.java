package Hw4_18000985;

import java.util.Iterator;

import javax.lang.model.element.Element;

public class LinkedStack<T> implements StackInterface<T> {
	class Node {
		T element;
		Node next;
		public Node(T data) {
			this.element=data;
			next=null;
	}
	}
	private Node stack = null;
	@Override
	public void push(T element) {
		Node p = new Node(element);
		p.next = stack;
		stack = p;
	}
	@Override
	public T pop() {
		T result = stack.element;
		stack = stack.next;
		return result;
	}
	@Override
	public boolean isEmpty() {
		return (stack == null);
	}
	@Override
	public T top() {	
		return stack.element;
	}
	@Override
	public Iterator<T> iterator() {
		return new StackIterator();
	}

	class StackIterator implements Iterator<T> {
		private Node currentNode = stack;

		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public T next() {

			T data = currentNode.element;
			currentNode = currentNode.next;
			return data;

		}
	}

	
}
