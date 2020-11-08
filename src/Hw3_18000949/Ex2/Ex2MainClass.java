package Hw3_18000949.Ex2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2MainClass {
    //Hàm nhập vào danh sách các hình khối
    public static ArrayList<Shape> inputArray(Scanner sc, int n) {
        ArrayList<Shape> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Shape shape;
            System.out.println("Choose type of shape: ");
            System.out.println("1. Circle ; 2. Sphere ; 3. Rectangle ");
            int choose = sc.nextInt();
            switch(choose) {
                case 1:
                    System.out.print("Input radius = ");
                    double radius1 = sc.nextDouble();
                    System.out.println();
                    shape = new Circle(radius1);
                    arr.add(shape);
                    break;
                case 2:
                    System.out.print("Input radius = ");
                    double radius2 = sc.nextDouble();
                    System.out.println();
                    shape = new Sphere(radius2);
                    arr.add(shape);
                    break;
                case 3: 
                    System.out.print("Input width = ");
                    double width = sc.nextDouble();
                    System.out.print("Input height = ");
                    double height = sc.nextDouble();
                    System.out.println();
                    shape = new Rectangle(width, height);
                    arr.add(shape);
                    break;
                default:
                    System.out.println("Error!");
            }
        }
        return arr;
    }

    //Hàm in ra danh sách các hình khối vừa nhập
    public static void outputArray(ArrayList<Shape> arr){
        for(Shape shape: arr){
            System.out.println(shape.toString());
        }
    }

    //Ứng dụng: In ra hình có chu vi lớn nhất trong dãy
    public static void compareArea(ArrayList<Shape> arr1){
        double max = arr1.get(0).getPerimeter();
        //Hàm so sánh
        for (int i = 1 ; i < arr1.size(); i++) {
            if(arr1.get(i).getPerimeter() > max) {
                    max = arr1.get(i).getPerimeter();
            }
        }
        for (int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i).getPerimeter() == max) {
                System.out.println(arr1.get(i).toString());
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sc.nextInt();
        ArrayList<Shape> arr = inputArray(sc,n);
        System.out.println("List shape: ");
        outputArray(arr);
        System.out.println();
        System.out.println("Max perimeter: ");
        compareArea(arr);

        
    }


    
}
