package by.gradle.first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();


    @Test
    void throwNumberFormatExceptionIfStringIsNull() {
        assertThrows(NumberFormatException.class, () -> stringUtils.isPositiveNumber(null));
    }

    @Test
    void returnTrueIfStringIsPositiveNumber() {
        assertTrue(stringUtils.isPositiveNumber("11.58"));
    }

    @Test
    void returnFalseIfStringIsNegativeNumberOrNotNumber() {
        assertAll(
                () -> assertFalse(stringUtils.isPositiveNumber("-11.58")),
                () -> assertFalse(stringUtils.isPositiveNumber("string"))
        );
    }

}
