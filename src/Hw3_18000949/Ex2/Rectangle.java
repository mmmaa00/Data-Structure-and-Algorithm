package Hw3_18000949.Ex2;

public class Rectangle extends Shape {
    private double width = 0;
    private double height = 0;
    public Rectangle(){
    }
    public Rectangle(double width, double height) {
        //Hàm khởi tạo
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    protected double getVolume() {
        return 0;
    }
    @Override
    protected double getArea() {
        return width * height;
    }
    @Override
    protected double getPerimeter() {
        return (width + height) * 2;
    }
    
    @Override
    public String toString() {
        return getName() + ": Width = " + width + "; Height = " + height + "; Perimeter = " + getPerimeter();
    }
}
