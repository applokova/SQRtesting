package ru.netology.javaqa.SQR;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3, 200, 300", "90, 100, 9801", "90, 99, 9801", "89, 101, 9801", "90, 100, 9802", "89, 100, 9800"
    })
    public void RangeTest(int expected, int rangeFrom, int rangeUpTo){
        SQRService service = new SQRService();
        int actual = service.calcSQR(rangeFrom, rangeUpTo);
        Assertions.assertEquals(expected, actual);
    }

}
