import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertAll(() -> assertEquals(4, Calculator.add(2, 2)),
                () -> assertEquals(0, Calculator.add(2, -2)),
                () -> assertEquals(-4, Calculator.add(-2, -2)),
                () -> assertEquals(1, Calculator.add(1, 0)));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("Divide two numbers")
    void divison() {
        assertAll(() -> assertEquals(1, Calculator.divison(2, 2)),
                () -> assertEquals(2, Calculator.divison(10, 5)),
                () -> assertEquals(4.5, Calculator.divison(9, 2)),
                () -> assertEquals(2.5, Calculator.divison(5, 2)));
    }
}