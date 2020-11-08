package Hw4_18000985;

import java.util.Iterator;

public class LinkedStackTest {
	
	public static void main(String[] args) {
		LinkedStack<Integer> stack= new LinkedStack<Integer>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		Iterator it = stack.iterator();
		System.out.print("- Cac phan tu cua stack duyet theo iterator la: ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("- Lay ra phan tu dau tien trong stack la : " + stack.pop());
		System.out.print("- Stack con lai cac phan tu la: ");
		Iterator it1 = stack.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
		System.out.println();
		System.out.println("- Kiem tra xem stack co rong hay khong: " + stack.isEmpty());
	}
}
