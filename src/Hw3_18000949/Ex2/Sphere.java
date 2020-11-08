package Hw3_18000949.Ex2;
//Đối tượng Sphere thừa kế Shape
public class Sphere extends Shape {
    public double PI = Math.PI;
    private double radius = 0;
    public Sphere() {
    }
    public Sphere(double radius) {
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
        return (double)4/3 * PI * Math.pow(radius, 3);
    }

    @Override
    protected double getArea() {
        return 4 * PI * Math.pow(radius,2);
    }

    @Override
    protected double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return getName() + ": Radius = " + radius + "; Volume = " + getVolume();
    }

}
