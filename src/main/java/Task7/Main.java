package Task7;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.printf("Area is : %.2f%n", circle.getArea());
        System.out.printf("Perimeter is : %.2f%n", circle.getPerimeter());
        System.out.println(circle);

        System.out.println("\nResizing Time");
        Resizable resizable = new ResizableCircle(40);
        System.out.println(resizable);
        System.out.println("After Resizing of 30%");
        resizable.resize(30);
        System.out.println(resizable);
    }
}
