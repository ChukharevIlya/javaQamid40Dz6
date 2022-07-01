package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void testCalcCount() {
        SQRService service = new SQRService();
        int min = 500;
        int max = 2000;
        int expected = 22;

        int actual = service.calcSqrt(min, max);

        assertEquals(expected, actual);
    }
}
