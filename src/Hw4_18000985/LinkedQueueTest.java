package Hw4_18000985;

import java.util.Iterator;

public class LinkedQueueTest {
	public static void main(String[] args) {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		System.out.print("- Cac phan tu trong queue(duyet theo iterator) la: ");
		Iterator it = queue.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("- Kiem tra queue co rong hay khong :" + queue.isEmpty());
		System.out.println("- So luong phan tu trong queue la: " + queue.size());
		System.out.println("- Xoa 1 phan tu trong queue do la: " + queue.dequeue());
		System.out.print("- Khi do queue con lai la: ");
		Iterator it1= queue.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
	}
}
