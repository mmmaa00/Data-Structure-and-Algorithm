package Hw1_18000949;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //Cách nhập dữ liệu từ bàn phím
        // byte var1 = scanner.nextByte();
        // short var2 = scanner.nextShort();
        // int var3 = scanner.nextInt();
        // long var4 = scanner.nextLong();
        // float var5 = scanner.nextFloat();
        // double var6 = scanner.nextDouble();
        System.out.println("Integral:");
        integral();
        System.out.println("Boolean:");
        boolean_();
        System.out.println("Character:");
        chareacter();
    }
    public static void integral() {
        //floating-point
        System.out.println("float: biểu diễn số thực");
        float floatExample1 = 0.5f;  //khi khai báo buộc phải thêm hậu tố f sau gtri biến
        float floatExample2 = 33.0f;
        float positiveExample = 99.9f; 
        float negativeExample = -99.9f;
        System.out.println("Example: " + floatExample1 + ", " + floatExample2 + ", " + positiveExample + ", " + negativeExample);
        
        System.out.println("double: biểu diễn số thực, miền giá trị lớn hơn float");
        double doubleExample1 = 0.5;  
        double doubleExample2 = 6546.1543 ;
        double doubleExample3 = 5e-2;
        System.out.println("Example: " + doubleExample1 + ", " + doubleExample2 + ", " + doubleExample3);

        //Integer
        System.out.println("int: biểu diễn số nguyên");
        int a; //giá trị mặc định = 0
        int intExample1 = -42;
        int intExample2 = 656;
        int maxInt = Integer.MAX_VALUE; 
        int minInt = Integer.MIN_VALUE; 
        System.out.println("Example: " + intExample1 + " " + intExample2);
        System.out.println("Miền giá trị: Max = " + maxInt + " và Min = " + minInt);

        System.out.println("long: biểu diễn số nguyên");
        long b; //giá trị mặc định = 0
        long longExample1 = -42L;
        long longExample2 = 656L;
        long maxLong = Long.MAX_VALUE; 
        long minLong = Long.MIN_VALUE; 
        System.out.println("Example: " + longExample1 + ", " + longExample2);
        System.out.println("Miền giá trị: Max = " + maxLong + " và Min = " + minLong);

        System.out.println("byte: biểu diễn số nguyên");
        byte c; //giá trị mặc định = 0
        byte byteExample1 = -42;
        byte byteExample2 = 65;
        byte maxByte = Byte.MAX_VALUE; 
        byte minByte = Byte.MIN_VALUE; 
        System.out.println("Example: " + byteExample1 + ", " + byteExample2);
        System.out.println("Miền giá trị: Max = " + maxByte + " và Min = " + minByte);

        System.out.println("short: biểu diễn số nguyên");
        short d; //giá trị mặc định = 0
        short shortExample1 = -42;
        short shortExample2 = 65;
        short maxShort = Short.MAX_VALUE; 
        short minShort = Short.MIN_VALUE; 
        System.out.println("Example: " + shortExample1 + ", " + shortExample2);
        System.out.println("Miền giá trị: Max = " + maxShort + " và Min = " + minShort);
    }
    public static void boolean_() {
        boolean myBoo1 = true;
        boolean myBoo2 = false;
        boolean myBoo3 = (1>2);
        boolean myBoo4 = (("abc").equals("acb"));
        boolean myBoo5 = (("abc").equals("abc"));
        System.out.println("Input: myBoo1: " + " Output: " + myBoo1);
        System.out.println("Input: myBoo2: " + " Output: " + myBoo2);
        System.out.println("Input: (1>2): " + " Output: " + myBoo3);
        System.out.println("Input: (abc == acb): " + " Output: " + myBoo4);
        System.out.println("Input: (abc == abc): " + " Output: " + myBoo5);
    }
    public static void chareacter() {
        char myChar1 = '5';
        char myChar2 = 't';
        char myChar3 = 65;
        char myChar4 = '\'';
        char myChar5 = '\"';
        System.out.println("Input: " + myChar1 + " Output: " + Character.toString(myChar1));
        System.out.println("Input: " + myChar2 + " Output: " + Character.toString(myChar2));
        System.out.println("Input: " + myChar3 + " Output: " + Character.toString(myChar3));
        System.out.println("Input: " + myChar4 + " Output: " + Character.toString(myChar4));
        System.out.println("Input: " + myChar5 + " Output: " + Character.toString(myChar5));
    }
}