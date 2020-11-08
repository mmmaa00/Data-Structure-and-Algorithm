package Hw2_18000949;
import java.util.Scanner;

public class Sorting3 {
    //Insertion sort
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
    public static void insertionSort(int[] array){
        int swap = 0; //số lần đổi chỗ
        int compare = 0; //số lần so sánh
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            System.out.println("Time " + i + ": ");
            for (int index = i - 1; index >= 0; index--) {
                if(array[index] >= value) {
                    compare++;
                    break;
                }
                else {
                    array[index+1] = array[index];
                    swap++;
                    compare++;
                    array[index] = value;
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
        insertionSort(arr);
        System.out.println();
        System.out.println("After sort: ");
        outputArray(arr);

    }
    
}
