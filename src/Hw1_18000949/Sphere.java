package Hw1_18000949;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Sphere {
    //hàm nhập thông tin tâm hình cầu
    public static double[] inputArray(Scanner sc) {
        System.out.print("Input I(x,y,z): ");
        double[] array = new double[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        return array;
    }
    public static void comparableSphere(Scanner scanner) {
        //Nhập thông tin hình cầu 1
        System.out.println("Input sphere 1: ");
        System.out.print("Input radius 1 = ");
        double r1 = scanner.nextDouble();
        double[] sphere1 = inputArray(scanner);
        //Nhập thông tin hình cầu 2
        System.out.print("Input radius 2 = ");
        double r2 = scanner.nextDouble();
        double[] sphere2 = inputArray(scanner);
        double x = Math.pow(sphere2[0] - sphere1[0],2);
        double y = Math.pow(sphere2[1] - sphere1[1],2);
        double z = Math.pow(sphere2[2] - sphere1[2],2);
        //Tính khoảng cách giữa 2 tâm 
        double distanceI = Math.sqrt(x+y+z);
        //Vị trí tương đối giữa 2 hình cầu
        double distanceR = r1 + r2;
        if(distanceI == distanceR) 
            System.out.println("Hai hình cầu tiếp xúc");
        else if(distanceI == Math.abs(r1-r2)) 
            System.out.println("Hai hình cầu bao nhau");
        else
            System.out.println("Hai hình cầu cắt nhau");

    }

    public static void main(String[] args) {
        double PI = Math.PI;
        //Nhập bán kính hình cầu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input radius = ");
        double r = scanner.nextDouble();
        //Nhập tâm hình cầu
        double[] array = inputArray(scanner);
        //Diện tích hình cầu
        double acreage  = 4 * PI * Math.pow(r,2);
        System.out.println("Acreage sphere = " + acreage);
        //Thể tích hình cầu
        double volume  = 4.0/3.0 * PI * Math.pow(r,3);
        System.out.println("Volume sphere = " + volume);

        //Vị trí tương đối giữa 2 hình cầu2
        comparableSphere(scanner);
    }
    
}
