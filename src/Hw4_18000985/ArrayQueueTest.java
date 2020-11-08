package Hw4_18000985;

import java.util.Iterator;

public class ArrayQueueTest {
	public static void main(String[] args) {
		ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		System.out.print("- In ra cac phan tu trong queue(duyet theo iterator) :");
		Iterator it = queue.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("- Kiem tra xem queue co rong hay khong: "+queue.isEmpty());
		System.out.println("- Xoa 1 phan tu trong queue do la: "+queue.dequeue());
		System.out.print("- Khi do queue con lai la: ");
		Iterator it1 = queue.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
	}
}
