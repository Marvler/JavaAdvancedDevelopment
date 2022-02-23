package EnumeratedTypes.Task3;

public enum TemperatureConverter {
    C_F('C', 'F', tempIn -> (tempIn * 9 / 5) + 32),
    C_K('C', 'K', tempIn -> tempIn + 273.15f),
    K_C('K', 'C', tempIn -> tempIn - 273.15f),
    F_C('F', 'C', tempIn -> (tempIn - 32) * 5 / 9);

    private final char input;
    private final char output;
    private final Converter converter;

    TemperatureConverter(char input, char output, Converter
            converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }

    public static float convertTemperature(char input, char
            output, float temp) {
        for (TemperatureConverter temperatureConverter : values()) {
            if (temperatureConverter.input == input &&
                    temperatureConverter.output == output) {
                return
                        temperatureConverter.converter.convert(temp);
            }
        }
        return Integer.MIN_VALUE;
    }
}
