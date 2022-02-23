package Exceptions.Task1;

public class DivideException {


    public static void main(String[] args) throws CannotDivideByZeroException {
        System.out.println(divide(5,0));
    }

    public static double divide(int a, int b) throws CannotDivideByZeroException {
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a/(double)b;
    }
}
