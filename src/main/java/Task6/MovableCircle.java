package Task6;

public class MovableCircle implements Movable{

    private final float radius;
    private final MovablePoint movablePoint;

    public MovableCircle(float radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.movablePoint = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return String.format("radius = %.2f, %s",radius, movablePoint);
    }
}
