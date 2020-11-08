package Hw4_18000985;

import java.util.Scanner;

public class Calculation {
	// thuc hiẹn tinh toan bieu thuc
	public static void TinhToan(String [] bieuthuc,ArrayStack<Character> toantu,ArrayStack<Double>toanhang) {
		for (int i = 0; i < bieuthuc.length; i++) {
			for (int j = 0; j < bieuthuc[i].length(); j++) {
				
				if (bieuthuc[i].charAt(j) == '(' || bieuthuc[i].charAt(j) == ' ') {
					
				} else if (bieuthuc[i].charAt(j) == '+' || bieuthuc[i].charAt(j) == '-' || bieuthuc[i].charAt(j) == '*'	|| bieuthuc[i].charAt(j) == '/') {
					toantu.push(bieuthuc[i].charAt(j));
					
				} else if (bieuthuc[i].charAt(j) == (')')) {
					double c = 0;
					Character o = toantu.pop();
					Double so2 = toanhang.pop();
					Double so1 = toanhang.pop();
					if (o == '+') {
						c = so1 + so2;
					} else if (o == '-') {
						c = so1 - so2;
					} else if (o == '*') {
						c = so1 * so2;
					} else {
						c = so1 / so2;
					}
					toanhang.push(c);
					
				} else {
					double d = Double.parseDouble(String.valueOf(bieuthuc[i].charAt(j)));
					toanhang.push(d);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayStack<Character> toantu = new ArrayStack<Character>();
		ArrayStack<Double> toanhang = new ArrayStack<Double>();
		
		String[] bieuthuc = { "(1 + ((2 + 3) * (4 * 5)))","((5 - ((8 - 4) * (2 + 3))) + (8 / 2))" };
		
		for (int i = 0; i < bieuthuc.length; i++) {
			System.out.println("Bieu thuc so "+(i+1)+" trong de bai la: "+bieuthuc[i]);
		}
		
		System.out.println("----------------");
		TinhToan(bieuthuc,toantu,toanhang);
		System.out.println("Dap so bieu thuc so 2 la: " + toanhang.pop());
		System.out.println("Dap so bieu thuc so 1 la: " + toanhang.pop());
	}
}
