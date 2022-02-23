package OOP.Task3;

public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled, side,side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setLength(length);
    }

    @Override
    public double getArea() {
        return Math.pow(length,2);
    }

    @Override
    public double getPerimeter() {
        return getLength() * 4;
    }
}
