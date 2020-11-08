package Hw4_18000985;

import java.util.Iterator;
public class LinkedQueue<T>  {
	class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node top = null;
	private Node bot = null;
	private int n = 0;

	public void enqueue(T element) {
		Node point = new Node(element);
		n++;
		if (top == null) {
			top = point;
			bot = point;
		} else {
			Node p = top;
			while (p.next != null) {
				p = p.next;
			}
			p.next = point;
		}
	}

	public T dequeue() {
		Node p = top;
		top = top.next;
		n--;
		return p.data;
	}

	public boolean isEmpty() {
		return (n == 0);
	}
	public int size() {
		return n;
	}
	public T get(int i) {
		int k = 0;
		if (top == null || i < 0 || i >= n) {
			return null;
		}
		Node p = top;
		while(p.next!=null  && k!=i) {
			p=p.next;
			k++;
		}
		return p.data;
	}
	public Iterator<T> iterator() {
		return new StackIterator();
	}

	class StackIterator implements Iterator<T> {
		private Node currentNode = top;

		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public T next() {

			T data = currentNode.data;
			currentNode = currentNode.next;
			return data;

		}
	}
	}

