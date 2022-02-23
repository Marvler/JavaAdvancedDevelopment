package OOP.Task7;

public class Circle implements GeometricObject{

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getArea() {
        return 2* Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Radius is : %.2f",radius);
    }
}
