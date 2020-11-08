package Hw2_18000949;

import java.util.Scanner;
//Bubble Sort

public class Sorting5<Type> {
    private static class Cell<Type> implements Comparable<Type>{
		private Type element;
		
		public Cell(Type element) {
			this.element = element;
		}
		
		public Type getElement() {
			return this.element;
		}	
		
		@Override
		public int compareTo(Type element1) {
			if(element instanceof String) { //kiểm tra xem element có phải kiểu String hay ko
				String str1 = element.toString();
				String str2 = element1.toString();
				return str1.compareTo(str2);				
			}else {
				double number1 = Double.parseDouble(element.toString());
				double number2 = Double.parseDouble(element1.toString());				
				if(number1 > number2) return 1; //quy ước so sánh 2 số: > trả về giá trị 1; = trả về 0 ; < trả về -1
				else if(number1 < number2) return -1;
				else return 0;				
			}			
		}		
    }
    //Bubble Sort - chiều tăng dần
    public static Cell[] mySort(Cell[] array) {
		for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if(array[j-1].compareTo(array[j].getElement()) > 0) {
                    Cell temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
		}
		return array;
    }
	public static void printArray(Cell[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i].getElement() + " ");
		}
	}
    public static void main(String[] args) {

        //type = String
        System.out.println("Type: String");
		System.out.print("Input n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
		Cell[] array1 = new Cell[n];
	    for (int i = 0; i < array1.length; i++) {
            System.out.print("a[" + i + "] = ");
            array1[i] = new Cell<String>(sc1.nextLine());
        }
		System.out.println("Before sorting:");
        printArray(array1);
        System.out.println();
		System.out.println("After sorting:");						
        printArray(mySort(array1));
        System.out.println();
        
        //type = Double
        System.out.println("Type: Double");
		System.out.print("Input m: ");
        int m = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
		Cell[] array2 = new Cell[m];
	    for (int i = 0; i < array2.length; i++) {
            System.out.print("a[" + i + "] = ");
            array2[i] = new Cell<Double>(sc2.nextDouble());
        }
		System.out.println("Before sorting:");
        printArray(array2);
        System.out.println();
		System.out.println("After sorting:");						
        printArray(mySort(array2));
	}
}

	
