package Task6;

public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(12, 13, 2, 5);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println("After move");
        System.out.println(movablePoint);
        System.out.println();

        MovableCircle movableCircle = new MovableCircle(10,15, 15, 3, 3);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println("After move");
        System.out.println(movableCircle);
    }
}
