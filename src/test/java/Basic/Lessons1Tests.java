package Basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Lessons1Tests {

    @Test
    public void lesson1ShouldReturnResultWhenThereAreMeanings() {
        double actual = Lessons1.lesson1(1, 2, 3);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void lesson1ShouldReturnResultWhenBIsNotEvent() {
        double actual = Lessons1.lesson1(2, 3, 4);
        Assertions.assertEquals(2.5, actual);
    }

}
