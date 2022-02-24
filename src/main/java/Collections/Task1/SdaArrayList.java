package Collections.Task1;

import java.util.Arrays;

public class SdaArrayList<T> {
    private static final int CAPACITY = 4;
    private int size = 0;
    private Object[] elementArray;

    public SdaArrayList() {
        elementArray = new Object[CAPACITY];
    }

    public void getByIndex(int index) {
        System.out.println(elementArray[index]);
    }

    public void add(T t) {
        if (size == elementArray.length) {
            increaseSize();
        }
        elementArray[size++] = t;
    }

    public void removeAtIndex(int index) {
        for (int i = index; i < size - 1; i++) {
            elementArray[i] = elementArray[i + 1];
        }
        size--;
        decreaseSize();

    }


    private void increaseSize() {
        int newCapacity = elementArray.length * 2;
        elementArray = Arrays.copyOf(elementArray, newCapacity);
    }

    private void decreaseSize() {
        elementArray = Arrays.copyOf(elementArray, elementArray.length - 1);
    }

    public void display() {
        for (Object object : elementArray) {
            System.out.println(object);
        }
    }

}


