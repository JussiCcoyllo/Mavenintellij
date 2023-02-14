import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @org.junit.jupiter.api.Test
    void sum() {
        Double expected = 30.00;
        Double actual = Calculator.sum(10, 20);

        assertEquals(expected, actual);    }

    @org.junit.jupiter.api.Test
    void subs() {
    }

    @org.junit.jupiter.api.Test
    void mult() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
    }

    @org.junit.jupiter.api.Test
    void power() {
    }
}