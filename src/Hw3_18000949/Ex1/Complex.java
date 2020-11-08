package Hw3_18000949.Ex1;
//Tạo đối tượng Complex
public class Complex {
    private float real; //phần thực
    private float image; //phần ảo
    public Complex(float r, float i) {
        //hàm khởi tạo
        this.real = r;
        this.image = i;
    }
    public Complex() {
    }
    public float realpart() {
        return real;
    }
    public void setReal(float real) {
        this.real = real;
    }
    public float imagepart() {
        return image;
    }
    public void setImage(float image) {
        this.image = image;
    }
    public Complex add(Complex c){
        //Hàm cộng số phức hiện tại với số phức c
        float real = this.real + c.real;
        float image = this.image + c.image;
        return new Complex(real,image);
    }
    public Complex minus(Complex c){
        //Hàm trừ số phức hiện tại cho số phức c
        float real = this.real - c.real;
        float image = this.image - c.image;
        return new Complex(real,image);
    }
    public Complex time(Complex c){
        //Hàm nhân số phức hiện tại với số phức c
        float real = this.real * c.real - this.image * c.image;
        float image = this.real * c.image + this.image * c.real;
        return new Complex(real,image);
    }
    @Override
    public String toString() {
        //In ra số phức dạng a + bi
        if(real > 0)
            return real + " + " + image + "i";
        else if (image == 0) //số thực
            return real + " ";
        else if (real == 0) //số thuần ảo
           return image + "i"; 
        else 
            return real + " - " + (-image) + "i";
    }
}
