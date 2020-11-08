package Hw3_18000949.Ex1;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1MainClass {

    //hàm nhập vào dãy n số phức
    public static ArrayList<Complex> inputArrayList(Scanner sc, int n){
        ArrayList<Complex> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần thực của số phức thứ " + (i+1) + " = ");
            float real = sc.nextFloat();
            System.out.print("Nhập phần ảo của số phức thứ " + (i+1) + " = ");
            float image = sc.nextFloat();
            Complex complex = new Complex(real,image);
            arr.add(complex);
        }
        return arr;
    }

    //hàm in ra dãy n số phức
    public static void outputArrayList(ArrayList<Complex> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).toString());
        }
    }

    //hàm tính tổng của n số phức
    public static Complex add(ArrayList<Complex> arr){
        Complex result = new Complex();
        for (int i = 0; i < arr.size(); i++) {
            result = result.add(arr.get(i));
        }
        return result;
    }

    //Ứng dụng: hàm tìm mô đun của số phức hiện tại
    public static double moduleComplex(Complex complex){
        double x = Math.pow(complex.realpart(), 2);
        double y = Math.pow(complex.imagepart(), 2);
        double result = Math.sqrt(x+y);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        ArrayList<Complex> arr = inputArrayList(sc, n);
        System.out.println("Dãy " + n + " số phức vừa nhập là: ");
        outputArrayList(arr);
        System.out.print("Nhập vị trí số phức muốn in: v = ");
        int v = sc.nextInt();
        if((v-1) > arr.size() || (v-1) < 0)
            System.out.println("Vị trí vượt quá mảng");
        for (int i = 0; i < arr.size(); i++) {
            if(i == (v-1))
                System.out.println("Số phức cần tìm là: " + arr.get(i).toString());
        }
        System.out.println("Tổng của " + n + " số phức vừa nhập là: " + add(arr));
        System.out.print("Nhập vị trí số phức cần tính mô đun: index = ");
        int index = sc.nextInt();
        if((index-1) > arr.size() || (index-1) < 0)
            System.out.println("Vị trí vượt quá mảng");
        for (int i = 0; i < arr.size(); i++) {
            if(i == (index-1)){
                System.out.println("Số phức được chọn là: " + arr.get(i).toString());
                System.out.println("Mô đun của số phức được chọn là: " + moduleComplex(arr.get(i)));
            }
        }
    }
}
