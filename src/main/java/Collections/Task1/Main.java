package Collections.Task1;

public class Main {


    public static void main(String[] args) {

        SdaArrayList<Integer> myList = new SdaArrayList<>();

        myList.add(null);
        myList.add(3);
        myList.add(54);
        myList.add(15);
        myList.removeAtIndex(2);
        myList.display();
        myList.getByIndex(2);
    }

}
