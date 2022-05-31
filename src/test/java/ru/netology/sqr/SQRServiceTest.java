package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalculateFrom200To300() {

        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);

        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateFrom200To200() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 200);

        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateFrom300To200() {
        SQRService service = new SQRService();

        int actual = service.calculate(300, 200);

        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateNegativeNumbers() {
        SQRService service = new SQRService();

        int actual = service.calculate(-200, -300);

        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateNegativeNumber200() {
        SQRService service = new SQRService();

        int actual = service.calculate(-200, 300);

        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateNegativeNumber300() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, -300);

        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}
