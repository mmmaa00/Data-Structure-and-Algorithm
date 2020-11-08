package Hw2_18000949;
import java.util.Scanner;

public class Sorting4 {
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
    //Selection
    public static int selectionSort(int[] array){
        int swap1 = 0; //số lần đổi chỗ
        int compare1 = 0; //số lần so sánh
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                compare1++;
                if(array[j] > array[maxIndex]) {
                    int temp = array[maxIndex];
                    array[maxIndex] = array[j];
                    array[j] = temp;
                    swap1++;
                }
            }
        }
        return compare1;
    }
    //Bubble Sort
    public static int bubbleSort(int[] array){
        int swap2 = 0; //số lần đổi chỗ
        int compare2 = 0; //số lần so sánh
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                compare2++;
                if(array[j-1] < array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    swap2++;
                }
            }
        }
        return compare2;
    }
    //Insertion sort
    public static int insertionSort(int[] array){
        int swap3 = 0; //số lần đổi chỗ
        int compare3 = 0; //số lần so sánh
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            for (int index = i - 1; index >= 0; index--) {
                if(array[index] >= value) {
                    compare3++;
                    break;
                }
                else {
                    array[index+1] = array[index];
                    swap3++;
                    compare3++;
                    array[index] = value;
                }
            }
        }
        return compare3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sc.nextInt();
        int[] arr1 = inputArray(sc, n);
        int[] arr2 = arr1;
        int[] arr3 = arr1;
        System.out.println("Bubble Sort: " + bubbleSort(arr1));
        System.out.println("Selection Sort: " + selectionSort(arr2));
        System.out.println("Insertion Sort: " + insertionSort(arr3));
        if(bubbleSort(arr1) < selectionSort(arr2) && bubbleSort(arr1) < insertionSort(arr3)) 
            System.out.println("Thuật toán Bubble Sort hiệu quả nhất đối với TH này.");
        else if(selectionSort(arr2) < bubbleSort(arr1) && selectionSort(arr2) < insertionSort(arr3)) 
            System.out.println("Thuật toán Selection Sort hiệu quả nhất đối với TH này.");
        else
            System.out.println("Thuật toán Insertion Sort hiệu quả nhất đối với TH này.");

    }
    
}
