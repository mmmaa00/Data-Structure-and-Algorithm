package Hw2_18000949;
import java.util.Scanner;

public class Sorting1 {
    //Bubble sort
    //Hàm nhập vào 1 mảng gồm n số nguyên
    public static int[] inputArray(Scanner sc, int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    //Hàm in mảng
    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    //Hàm sắp xếp các phần tử trong mảng (theo thứ tự giảm dần)
    public static void bubbleSort(int[] array){
        int swap = 0; //số lần đổi chỗ
        int compare = 0; //số lần so sánh
        for (int i = 0; i < array.length; i++) {
            System.out.println("Time " + (i+1) + ": ");
            for (int j = 1; j < array.length - i; j++) {
                compare++;
                if(array[j-1] < array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    swap++;
                }
            }
            outputArray(array);
        }
        System.out.println("Compare: " + compare + " times");
        System.out.println("Swap: " + swap + " times");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sc.nextInt();
        int[] arr = inputArray(sc, n);
        System.out.print("Before sort: ");
        outputArray(arr);
        System.out.println();
        System.out.println("Sorting:");
        bubbleSort(arr);
        System.out.println();
        System.out.println("After sort: ");
        outputArray(arr);
    }
    
}
