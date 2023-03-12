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

    @Test
    public void testSubtraction() {
        int result = Calculator.subtract(5, 3);
        assertEquals(2, result);
    }
    @Test
    public void testSubtractionNegativeValue() {
        int result = Calculator.subtract(5, -3);
        assertEquals(8, result);
    }
    @Test
    public void testSubtractionTwoNegativeValue() {
        int result = Calculator.subtract(-5, -3);
        assertEquals(-2, result);
    }

    // @Test
    // public void testMultiplication() {
    //     int result = Calculator.multiply(5, 3);
    //     assertEquals(15, result);
    // }

    @Test
    public void testDivision() {
        assertEquals(0.5, Calculator.divide(1, 2), 0);
    }

    @Test
    public void testDivisionNegative() {
        assertEquals(-0.5, Calculator.divide(1, -2), 0);
    }

    @Test
    public void testDivisionExtremeMAX() {
        assertEquals(-1, Calculator.divide(Double.MAX_VALUE, -Double.MAX_VALUE), 0);
    }

    @Test
    public void testDivisionExtremeMIN() {
        assertEquals(-1, Calculator.divide(Double.MIN_VALUE, -Double.MIN_VALUE), 0);
    }

    @Test
    public void testDivisionZero() {
        assertEquals(Double.MAX_VALUE*1.01, Calculator.divide(1, 0), 0);
    }

    @Test
    public void testDivisionNaN() {
        assertEquals(Double.MAX_VALUE*1.01, Calculator.divide(3, 0), 0);
    }

    // @Test(expected = IllegalArgumentException.class)
    // public void testDivisionByZero() {
    //     Calculator.divide(6, 0);
    // }

    @Test
    public void testMultiplication(){
        double result = Calculator.multiply(3, 2);
        assertEquals(6, result, 0);
    }

}
