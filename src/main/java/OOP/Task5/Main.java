package OOP.Task5;

import OOP.Task1.Point2D;

public class Main {

    public static void main(String[] args) {
        Point2D startPoint = new Point2D(2,6);
        Point2D endPoint = new Point2D(-1,-8);
        Line line = new Line(startPoint,endPoint);

        System.out.println(line.centerPoint());
        System.out.println(line.getLineLength());

        Line line1 = new Line(1,2,3,4);
        System.out.println(line1.centerPoint());
        System.out.println(line1.getLineLength());
    }
}
