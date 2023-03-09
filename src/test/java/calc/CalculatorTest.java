package calc;
import org.junit.Test;
import static org.junit.Assert.*;
import calc.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        int result = Calculator.add(5, 3);
        assertEquals(8, result);
    }

    // @Test
    // public void testSubtraction() {
    //     int result = Calculator.subtract(5, 3);
    //     assertEquals(2, result);
    // }

    // @Test
    // public void testMultiplication() {
    //     int result = Calculator.multiply(5, 3);
    //     assertEquals(15, result);
    // }

    // @Test
    // public void testDivision() {
    //     int result = Calculator.divide(6, 3);
    //     assertEquals(2, result);
    // }

    // @Test(expected = IllegalArgumentException.class)
    // public void testDivisionByZero() {
    //     Calculator.divide(6, 0);
    // }
}
