package by.clevertec.gradle.first;

public class StringUtils {

    private final String POSITIVE_NUMBER_REGEX = "^[+]?\\d([.,]?\\d)+$";

    public boolean isPositiveNumber(String string) throws NumberFormatException {
        if (string == null) {
            throw new NumberFormatException();
        }
        return string.matches(POSITIVE_NUMBER_REGEX);
    }
}
