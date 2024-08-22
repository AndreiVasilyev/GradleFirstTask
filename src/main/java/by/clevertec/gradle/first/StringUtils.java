package by.clevertec.gradle.first;

public class StringUtils {

    public boolean isPositiveNumber(String string) {
        return string.matches("[+-]?\\d+");
    }
}
