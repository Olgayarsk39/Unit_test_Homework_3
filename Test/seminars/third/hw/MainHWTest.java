package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seminars.third.hw.MainHW;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

// Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
// переданное число четным или нечетным.
// Нужно покрыть тестами метод на 100%

// Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
// переданное число в интервал (25;100)
// Покрыть тестами метод на 100%

class MainHWTest {
    private MainHW mainHW;

    @BeforeEach
    void setup() {
        mainHW = new MainHW();
    }

    @Test
    public void testEvenOddNumber_EvenTrue() {
        assertTrue(mainHW.evenOddNumber(4));
    }

    @Test
    public void testEvenOddNumber_OddFalse() {
        assertFalse(mainHW.evenOddNumber(7));
    }

    @Test
    void numberInInterval_From25to100_True() {
        assertTrue(mainHW.numberInInterval(50));
    }

    @Test
    void numberInInterval_LessThan25_False() {
        assertFalse(mainHW.numberInInterval(10));
    }

    @Test
    void numberInInterval_EqualTo25_False() {
        assertFalse(mainHW.numberInInterval(25));
    }

    @Test
    void numberInInterval_GreaterThan100_False() {
        assertFalse(mainHW.numberInInterval(150));
    }
}