package Hw2_18000949;
import java.util.Scanner;

public class Sorting2 {
    //Selection sort
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
    public static void selectionSort(int[] array){
        int swap = 0; //số lần đổi chỗ
        int compare = 0; //số lần so sánh
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            System.out.println("Time " + (i+1) + ": ");
            for (int j = i + 1; j < array.length; j++) {
                compare++;
                if(array[j] > array[maxIndex]) {
                    int temp = array[maxIndex];
                    array[maxIndex] = array[j];
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
        selectionSort(arr);
        System.out.println();
        System.out.println("After sort: ");
        outputArray(arr);

    }
    
}
