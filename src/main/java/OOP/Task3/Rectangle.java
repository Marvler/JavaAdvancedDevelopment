package OOP.Task3;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2*width + 2*length;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width = %.2f and length = %.2f which is subclass of %s",width,length, super.toString());
    }
}
