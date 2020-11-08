package Hw1_18000949;
import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] array = array(sc, n);
        System.out.println("Số các số nguyên tố trong mảng: ");
        output_isPrime(array);
        System.out.println();
        System.out.println("Số các số hoàn hảo trong mảng: ");
        output_isPerfect(array);
    }

    //hàm nhập vào 1 mảng gồm n số nguyên
    public static int[] array(Scanner sc, int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    //hàm loại bỏ các giá trị trùng lặp trong mảng
    public static void test(int[] arr1) {
        int[] arr2 = arr1;  //Ý tưởng của bản thân: Khởi tạo 1 mảng mới (output) giống hệt mảng input. 
        for (int i = 0; i < arr1.length ; i++) { //Sdung 2 vòng lặp for, nếu ptu input[i] = input[j] thì gán gtri output[j] = -1
            for (int j = i + 1 ; j < arr1.length ; j++) { 
                if(arr1[i] == arr1[j] && arr1[i] != 0) 
                    arr2[j] = -1;
            }
        } //sau bước này, ta thu được mảng output với các vị trí bị trùng lặp sẽ mang gtri -1
        for (int i = 0; i < arr2.length; i++) {  
            if(arr2[i] != -1 && arr2[i] != 0)
                System.out.print(arr1[i] + " ");
        }
    }

    //hàm kiểm tra 1 số có phải là số nguyên tố hay không 
    public static boolean isPrime(int a){
        if(a < 2) 
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //hàm kiểm tra 1 số có phải là số hoàn hảo hay không
    public static boolean isPerfect(int a){
        if(a <= 1) 
            return false;
        int sum = 0 ;
        for (int i = 1; i < a; i++) {
            if(a % i == 0) {
                sum = sum + i;
            }
        }
        if(sum != a) 
            return false;
        return true;
    }

    //hàm in ra các số nguyên tố trong mảng 
    public static void output_isPrime(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if(isPrime(array[i])) {
                count++;
            }
        }
        if(count == 0)
            System.out.println("Dãy số ban đầu ko chứa số nguyên tố");
        else{
            int[] str = new int[array.length];
            for (int i = 0; i < str.length ; i++) {
                if(isPrime(array[i])) {
                    str[i] = array[i];
                }
            }
            test(str);
        }
    }

    //hàm in ra các số hoàn hảo trong mảng 
    public static void output_isPerfect(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if(isPerfect(array[i])) {
                count++;
            }
        }
        if(count == 0)
            System.out.println("Dãy số ban đầu ko chứa số hoàn hảo");
        else{
            int[] str = new int[array.length];
            for (int i = 0; i < str.length ; i++) {
                if(isPerfect(array[i])) {
                    str[i] = array[i];
                }
            }
            test(str);
        }
    }
    
}
