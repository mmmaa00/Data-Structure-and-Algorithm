package Hw4_18000985;

import java.util.Iterator;

public class ArrayStack<T> implements StackInterface<T> {
	public static final int defaultSize = 1000;
	private T[] array;
	private int n = -1;

	public ArrayStack() {
		array = (T[]) new Object[defaultSize];
	}

	public ArrayStack(int n) {
		array = (T[]) new Object[n];
	}

	@Override
	public void push(T element) {
		if (array.length == n) {
			System.out.println("Stack is full");
		} else {
			array[++n] = element;
		}

	}

	@Override
	public T pop() {
		if (isEmpty()) {
			return null;
		}
		T result = array[n];
		array[n] = null;
		n--;
		return result;
	}

	@Override
	public boolean isEmpty() {
		return (n == -1);
	}

	@Override
	public T top() {
		if (isEmpty()) {
			return null;
		}
		return array[n];
	}

	@Override
	public Iterator<T> iterator() {
		Iterator<T> it = new Iterator<T>() {
			private int current = n+1;

			@Override
			public boolean hasNext() {
				return current>0;
			}

			@Override
			public T next() {
				if (hasNext()) {
					return array[--current];
				}
				return null;
			}
		};
		return it;
	}
}
