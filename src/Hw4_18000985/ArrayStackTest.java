package Hw4_18000985;
import java.util.Iterator;

public class ArrayStackTest {
	public static void main(String[] args) {
		ArrayStack<Integer> list = new ArrayStack<Integer>();
		list.push(0);
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		Iterator it =list.iterator();
		System.out.print("- Cac phan tu cua stack duyet theo iterator la: ");
		while(it.hasNext()) {
			System.out.print(it.next() +" ");
		}
		System.out.println();
		System.out.print("- Lay phan tu "+ list.pop() + " khoi stack, stack con lai cac phan tu la: ");
		list.pop();
		Iterator it1 =list.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		System.out.println("- Kiem tra xem stack co rong hay khong: "+list.isEmpty());
	}

}
