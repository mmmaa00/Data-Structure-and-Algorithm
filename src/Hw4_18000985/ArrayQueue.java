package Hw4_18000985;

import java.util.Iterator;

public class ArrayQueue<T> implements QueueInterface<T> {
	private T[] queue;
	private int top = 0;
	private int count = 0;
	private int default_size = 100;

	public ArrayQueue(int capacity) {
		queue = (T[]) new Object[capacity];
	}

	public ArrayQueue() {
		queue = (T[]) new Object[default_size];
	}

	@Override
	public void enqueue(T element) {
		if (count == queue.length) {
			System.out.println("Queue is Full");
		} else {
			int avai = (count + top) % queue.length;
			queue[avai] = element;
			count++;
		}
	}
	@Override
	public T dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			T result = queue[top];
			queue[top] = null;
			top = (top + 1) % queue.length;
			count--;
			return result;
		}
	}
	@Override
	public boolean isEmpty() {
		return (count == 0);
	}
	public Iterator<T> iterator() {
		return new ArrayQueueIterator();
	}
	class ArrayQueueIterator implements Iterator<T> {
		private int current = top;

		private int num = 0;

		public boolean hasNext() {

			return num < count;

		}

		public T next() {
			T data = queue[(current + num) % queue.length];

			num++;
			return data;
		}
	}

}
