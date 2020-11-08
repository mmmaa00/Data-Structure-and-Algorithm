package Hw4_18000985;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 1 chuoi de kiem tra ,nhan Enter khi muon ket thuc: ");
		String s = sc.nextLine();
		if (Check(s) == true) {
			System.out.println("chuoi nay palindrome");
		}else {
			System.out.println("chuoi nay ko phai la palindrome");
		}
	}
// kiem tra chuoi co phai la palidrome hay khong
	public static boolean Check(String d) {
		ArrayStack<Character> stack = new ArrayStack<Character>();
		ArrayQueue<Character> queue = new ArrayQueue<Character>();
		for (int i = 0; i < d.length(); i++) {
			queue.enqueue(d.charAt(i));
			stack.push(d.charAt(i));
		}
		for (int i = 0; i < d.length(); i++) {
			if (queue.dequeue() != stack.pop()) {
				return false;
			}
		}
		return true;
	}
}
