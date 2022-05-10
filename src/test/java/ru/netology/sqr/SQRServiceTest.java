package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200,300"})
    void shouldCalcAmountOfSqr(int minLimit, int maxLimit) {
        SQRService service = new SQRService();
        int expected = 3;

        int actual = service.calcAmountOfSqr(minLimit, maxLimit);

        assertEquals(expected, actual);
    }
}