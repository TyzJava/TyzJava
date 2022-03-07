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
    public void sumSquaresShouldReturnThis() {
        Assertions.assertEquals(338350, BasicCycles.sumSquares());
    }

    @Test
    public void productSquaresShouldReturn() {
        Assertions.assertEquals(2686700, BasicCycles.productSquares());
    }

    @Test
    public void sumMembersShouldReturnSumWhenNumberOfMembersAndEIsIt() {
        Assertions.assertEquals(0.8333333333333333, BasicCycles.sumMembers(5, 0.4));
    }

    @Test
    public void intWithCharShouldReturnIntegerValuesOfCharsWhenThereIsALine() {
        int[] actual = BasicCycles.intWithChar("Hello");
        int[] expected = new int[] {72, 101, 108, 108, 111};
        Assertions.assertArrayEquals(expected, actual);
    }
}
