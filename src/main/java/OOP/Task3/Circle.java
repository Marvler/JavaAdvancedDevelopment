package OOP.Task3;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %.2f which is subclass of %s",radius, super.toString());
    }
}
