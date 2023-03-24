package calc;
import org.junit.Test;
import static org.junit.Assert.*;
import calc.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        double result = Calculator.add(5, 3);
        assertEquals(8, result, 0);
    }

    @Test
    public void testSubtraction() {
        double result = Calculator.subtract(5, 3);
        assertEquals(2, result, 0);
    }
    @Test
    public void testSubtractionNegativeValue() {
        double result = Calculator.subtract(5, -3);
        assertEquals(8, result, 0);
    }
    @Test
    public void testSubtractionTwoNegativeValue() {
        double result = Calculator.subtract(-5, -3);
        assertEquals(-2, result, 0);
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


    @Test
    public void integrationTest0(){
        // ((3 + 2) - 2.3) * 5.3 / 7 + 9
        double result = Calculator.add(3,  2);
        result = Calculator.subtract(result, 2.3);
        result = Calculator.multiply(result, 5.3);
        result = Calculator.divide(result,   7);
        result = Calculator.add(result,      9);

        double correct = ((3 + 2) - 2.3) * 5.3 / 7 + 9;

        assertEquals(correct, result, 0);
    }
    
}
