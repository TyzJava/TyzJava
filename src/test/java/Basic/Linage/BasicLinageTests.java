package Basic.Linage;

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
}
