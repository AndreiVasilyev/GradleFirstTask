package by.gradle.first;

public class StringUtils {

    private final String POSITIVE_NUMBER_REGEX = "^[+]?\\d([.,]?\\d)+$";

    public boolean isPositiveNumber(String string) throws NumberFormatException {
        if (string == null) {
            System.out.println("Exception: Wrong input data");
            throw new NumberFormatException();
        }
        if (string.matches(POSITIVE_NUMBER_REGEX)) {
            System.out.println("String: " + string + " is a positive number");
            return true;
        }
        System.out.println("String: " + string + " is not a positive number");
        return false;
    }
}
