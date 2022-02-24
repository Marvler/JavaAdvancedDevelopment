package Collections.Task3;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] array = new Random().ints(100, 0, 51).toArray();
        List<Integer> sortedArray = Arrays.stream(array).boxed().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
        System.out.println(sortedArray);
        System.out.println(getListOfUniqueNumbers(sortedArray));
        System.out.println(getListOfRepeatedValues(sortedArray));
    }

    public static List<Integer> getListOfUniqueNumbers(List<Integer> array) {
        return array.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> getListOfRepeatedValues(List<Integer> array){
        Set<Integer> items = new HashSet<>();

        return array.stream()
                .filter(n -> !items.add(n)).distinct().collect(Collectors.toList());

    }
}
