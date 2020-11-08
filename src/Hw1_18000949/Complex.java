package Hw1_18000949;
import java.util.ArrayList;
import java.util.Scanner;
//Ex3
public class Complex {
    public double re, im; //real: phần thực; imaginary: phần ảo
    public Complex(){
    }
    public Complex(double real, double imaginary) {
        this.re = real;
        this.im = imaginary;
    }
    public double getIm() {
        return im;
    }
    public double getRe() {
        return re;
    }
    public void setRe(double Re) {
        this.re = re;
    }
    public void setIm(double im) {
        this.im = im;
    }
    public static void toString(Complex a){
        double im = a.im;
        double re = a.re;
        if(im > 0)
            System.out.println(re + " + " + im + "i") ;
        else if (im == 0) //số thực
            System.out.println(re + " ") ;
        else if (re == 0) //số thuần ảo
           System.out.println(im + "i"); 
        else 
            System.out.println(re + " - " + (-im) + "i") ;
    }
    //2 số phức
    public static Complex addition(Complex a, Complex b) {
        double re = a.re + b.re;
        double im = a.im + b.im;
        return new Complex(re,im);
    }
    public static Complex multiplication(Complex a, Complex b) {
        double re = a.re * b.re - a.im * b.im;
        double im = a.re * b.im + a.im * b.re;
        return new Complex(re,im);
    }
    //n số phức
    public static ArrayList<Complex> inputArrayList() {
        Scanner sc1 = new Scanner(System.in);        
        System.out.print("Input n = ");
        int n = sc1.nextInt();
        ArrayList<Complex> arr = new ArrayList<Complex>(n);
        for (int i = 0; i < n; i++) {
            System.out.print("Input complex " + (i+1) + ": ");
            double re = sc1.nextDouble();
            double im = sc1.nextDouble();
            Complex complex = new Complex(re,im);
            arr.add(complex);
        }
        return arr;
    }
    public static Complex additionNComplex(ArrayList<Complex> array) {
        double re = array.get(0).re;
        double im = array.get(0).im;
        for (int i = 1; i < array.size(); i++) {
            re = re + array.get(i).re;
            im = im + array.get(i).im;
        }
        return new Complex(re,im);
    }
    public static Complex multiplicationNComplex(ArrayList<Complex> array) {
        Complex multi = new Complex(array.get(0).re,array.get(0).im);
        for (int i = 1; i < array.size(); i++) {
            multi = multiplication(array.get(i), multi);
        }
        return multi;
    }
    public static void main(String[] args) {
        //Nhập vào 2 số phức a,b
        Scanner sc = new Scanner(System.in);      
        System.out.println("Complex1: ");
        System.out.print("Input re1 and im1: ");
        double re1 = sc.nextDouble();
        double im1 = sc.nextDouble();
        Complex a = new Complex(re1,im1);
        System.out.println("Complex2: ");
        System.out.print("Input re2 and im2: ");
        double re2 = sc.nextDouble();
        double im2 = sc.nextDouble();
        Complex b = new Complex(re2,im2);

        //Tính tổng 2 số phức vừa nhập
        System.out.print("Addition of 2 complexs: a + b = ") ;
        toString(addition(a, b));

        //Tính tích 2 số phức vừa nhập
        System.out.print("multi of 2 complexs: a * b = ") ;
        toString(multiplication(a, b));

        //N số phức
        ArrayList<Complex> arr = inputArrayList();

        //Tổng n số phức 
        System.out.print("Addition of comlexs: ") ;
        toString(additionNComplex(arr));

        //Tích n số phức
        System.out.print("Multi of comlexs: ") ;
        toString(multiplicationNComplex(arr));
    }
}
