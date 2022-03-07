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
}
