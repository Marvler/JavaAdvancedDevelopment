package OOP.Task5;

import OOP.Task1.Point2D;

public class Line {

    private Point2D startPoint;
    private Point2D endpoint;

    public Line(Point2D startPoint, Point2D endpoint) {
        this.startPoint = startPoint;
        this.endpoint = endpoint;
    }

    public Line(float x1,float y1, float x2, float y2) {
        startPoint = new Point2D(x1, y1);
        endpoint = new Point2D(x2, y2);
    }

    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Point2D endpoint) {
        this.endpoint = endpoint;
    }

    public float getLineLength(){
        return (float) Math.sqrt((Math.pow(2,(endpoint.getX()-startPoint.getX())) + Math.pow(2,(endpoint.getY() - startPoint.getY()))));
    }

    public Point2D centerPoint(){
        return new Point2D(endpoint.getX()+startPoint.getX(), endpoint.getY() + startPoint.getY());
    }


}
