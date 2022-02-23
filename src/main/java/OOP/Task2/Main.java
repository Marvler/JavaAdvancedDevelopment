package OOP.Task2;

public class Main {

    public static void main(String[] args) {
        Person student = new Student("John", "BC 43", "IT", 1,
                1000);
        Person staff = new Lecturer("Computer Programming", 4500f);
        System.out.println(student);
        System.out.println(staff);
    }
}
