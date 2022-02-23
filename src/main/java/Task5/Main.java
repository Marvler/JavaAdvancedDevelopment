package Task5;

import Task1.Point2D;

public class Main {

    public static void main(String[] args) {
        Point2D startPoint = new Point2D(2,6);
        Point2D endPoint = new Point2D(-1,-8);
        Line line = new Line(startPoint,endPoint);

        System.out.println(line.centerPoint());
        System.out.println(line.getLineLength());
    }
}
