import exception.DivideByZeroException;
import exception.NotANumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void sumPositive() {
        Double expected = 30.00;
        Double actual = Calculator.sum(10, 20);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumNegatives(){
        Double expected = 30.00;
        Double actual = Calculator.sum(-10.00, 40.00);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumNotANumber(){
        NotANumberException notANumberException = assertThrows(NotANumberException.class, () -> {
            Calculator.sum(Double.NaN, Double.NaN);
        });
        assertEquals(notANumberException.getMessage(), "");
    }

    @org.junit.jupiter.api.Test
    void subsPositive() {
        Double expected = 30.00;
        Double actual = Calculator.subs(40.00, 10.00);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void subsNegative() {
        Double expected = 30.00;
        Double actual = Calculator.subs(-40.00, -70.00);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void multPositive() {
        Double expected = 30.00;
        Double actual = Calculator.mult(5, 6);

        assertEquals(expected, actual);
    }

    @Test
    void multNegative() {
        Double expected = 30.00;
        Double actual = Calculator.mult(-5, -6);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void divideByZero() {
        Calculator.sum(Double.NaN, 1.0);
        DivideByZeroException divideByZeroException = assertThrows(DivideByZeroException.class, () -> {
            Double a = Calculator.divide(5, 0);
            System.out.println(a);
        });
        assertEquals(divideByZeroException.getMessage(), "Cannot divide by 0");
    }

    @Test
    void divideNegative() {
        Double expected = 30.00;
        Double actual = Calculator.divide(-180, -6);

        assertEquals(expected, actual);
    }

    @Test
    void dividePositive() {
        Double expected = 30.00;
        Double actual = Calculator.divide(180, 6);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void powerZero() {
        Double expected = 1.00;
        Double actual = Calculator.power(10, 0);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void powerPositive() {
        Double expected = 100.00;
        Double actual = Calculator.power(10, 2);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void powerNegative() {
        Double expected = 0.01;
        Double actual = Calculator.power(10, -2);

        assertEquals(expected, actual);
    }
}