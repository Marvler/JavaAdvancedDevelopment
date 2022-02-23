package EnumeratedTypes.Task3;

public class Main {

    public static void main(String[] args) {
        float convertedTemp =
                TemperatureConverter.convertTemperature('K', 'C', 34);
        System.out.println(convertedTemp);
    }
}
