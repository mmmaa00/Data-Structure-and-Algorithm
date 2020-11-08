package Hw3_18000949.Ex2;
//Đối tượng Circle thừa kế Shape
public class Circle extends Shape {
    public double PI = Math.PI;
    private double radius = 0;
    public Circle() {
    }
    public Circle(double radius) {
        //Hàm khởi tạo
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getVolume() {
        return 0;
    }
    
    @Override
    protected double getArea() {
        return PI * Math.pow(radius,2);
    }

    @Override
    protected double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString(){
        return getName() + ": Radius = " + radius + "; Perimeter = " + getPerimeter();
    }
}
