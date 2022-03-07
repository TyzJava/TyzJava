package Basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BasicCyclesTests {

    @Test
    public void calcFactorialShouldCalculatorFactorialWhenXEqualsOne() {
        Assertions.assertEquals(1, BasicCycles.calcFactorial(1));
    }

    @Test
    public void calcFactorialShouldCalculatorFactorialWhenXIsValue() {
        Assertions.assertEquals(6, BasicCycles.calcFactorial(3));
    }

    @Test
    public void calcValuesOnSegmentShouldReturnValuesWhenSegmentAndStepAreGiven() {
        double[] actual = BasicCycles.calcValuesOnSegment(-3, 10, 4);
        double[] expected = new double[] {3, -1, 5, 9};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sumOfSquaresOfTheFirstHundredDigitsShouldReturnThis() {
        Assertions.assertEquals(338350, BasicCycles.sumOfSquaresOfTheFirstHundredDigits());
    }
}
