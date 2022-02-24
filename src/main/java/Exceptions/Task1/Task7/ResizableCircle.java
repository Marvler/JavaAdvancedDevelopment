package Exceptions.Task1.Task7;

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
            radius = radius - radius * ( (double) percent / 100);
    }

}
