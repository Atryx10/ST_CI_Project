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


    // For re-submissison 
    // @Test
    // public void testAbsPositive(){
    //     double result = Calculator.abs(2);
    //     assertEquals(2, result, 0);
    // }

    // @Test
    // public void testAbsNegative(){
    //     double result = Calculator.abs(-2);
    //     assertEquals(2, result, 0);
    // }

    // @Test
    // public void integrationTest0(){
    //     double add0 = 3;
    //     double add1 = 2;
    //     double sub0 = 22.3;
    //     double mul0 = 5.3;
    //     double div0 = 7;
    //     double add2 = -9;
        
    //     // Here we test that all operators return values that can feed into each other without loosing information.
    //     double result = Calculator.add(add0, add1);
    //     result = Calculator.subtract(result, sub0);
    //     result = Calculator.multiply(result, mul0);
    //     result = Calculator.divide(result,   div0);        
    //     result = Calculator.abs(result);            // New operation to implement TDD workflow. 
    //     result = Calculator.add(result,      add2); // Complete loop, so all functions' output are tested

        
    //     double correct = Math.abs(((add0 + add1) - sub0) * mul0 / div0) + add2;
    //     assertEquals(correct, result, 0);
    // }
    
}
