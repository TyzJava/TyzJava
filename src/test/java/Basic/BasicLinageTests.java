package Basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BasicLinageTests {

    @Test
    public void valueOfFunctionZShouldReturnResultWhenThereAreMeanings() {
        double actual = BasicLinage.valueOfFunctionZ(1, 2, 3);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void valueOfFunctionZShouldReturnResultWhenBIsNotEvent() {
        double actual = BasicLinage.valueOfFunctionZ(2, 3, 4);
        Assertions.assertEquals(2.5, actual);
    }

    @Test
    public void valueOfFunctionWithDoubleShouldReturnResultWhenBIsNotEvent() {
        double actual = BasicLinage.valueOfFunctionWithDouble(2, 3, 4);
        Assertions.assertEquals(-22.48576465145604, actual);
    }

    @Test
    public void valueOfFunctionSinCosTgShouldReturnResultWhenThereAreMeanings() {
        double actual = BasicLinage.valueOfFunctionSinCosTg(30, 30);
        Assertions.assertEquals(-10.994069641154754,actual);
    }

    @Test
    public void swappingShouldSwapTheFractionAndIntegerPartOfNumberWhenThereIsARealNumber() {
        double actual = BasicLinage.swapping(123.456);
        Assertions.assertEquals(456.123, actual);
    }

    @Test
    public void conversionToHorseShouldReturnTimeWhenValueIsSeconds() {
        String actual = BasicLinage.conversionToHorse(123456);
        Assertions.assertEquals("34ч 17мин 36с", actual);
    }

    @Test
    public void definesBelongingShouldReturnFalseWhenXAndYAreGreaterThanTheGivenRange() {
        Assertions.assertFalse(BasicLinage.definesBelonging(3, 5));
    }

    @Test
    public void definesBelongingShouldReturnFalseWhenXAreGreaterThanTheGivenRange() {
        Assertions.assertFalse(BasicLinage.definesBelonging(3, 3));
    }

    @Test
    public void definesBelongingShouldReturnFalseWhenYAreGreaterThanTheGivenRange() {
        Assertions.assertFalse(BasicLinage.definesBelonging(1, 5));
    }

    @Test
    public void definesBelongingShouldReturnTrueWhenXAndYAreEqualsThanTheGivenRange() {
        Assertions.assertTrue(BasicLinage.definesBelonging(1, 3));
    }

    @Test
    public void definesBelongingShouldReturnFalseWhenXIsGreaterAndYLessThanTheGivenRange() {
        Assertions.assertFalse(BasicLinage.definesBelonging(3, -4));
    }
}
