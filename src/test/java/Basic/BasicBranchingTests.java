package Basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BasicBranchingTests {

    @Test
    public void existenceTriangleShouldDetermineThatATriangleDoesNotExistWhenTheSumOfTheGivenAnglesIsGreaterThan180Degrees() {
        String actual = BasicBranching.existenceTriangle(150, 120);
        Assertions.assertEquals("Triangle not exist", actual);
    }

    @Test
    public void existenceTriangleShouldDetermineThatAnExistingTriangleIsARightTriangleWheOneOfTheAnglesIs90DegreesAndTheOtherIsLessThan90Degrees() {
        String actual = BasicBranching.existenceTriangle(90, 60);
        Assertions.assertEquals("Triangle exist - rectangular", actual);
    }

    @Test
    public void existenceTriangleShouldDetermineThatAnExistingTriangleIsARightTriangleWhenTheSumOFTwoAnglesIs90Degrees() {
        String actual = BasicBranching.existenceTriangle(30, 60);
        Assertions.assertEquals("Triangle exist - rectangular", actual);
    }

    @Test
    public void existenceTriangleShouldDetermineThatAnExistingTriangleIsANotRightTriangleWhenTheSumOfTwoAnglesIsNot90Degrees() {
        String actual = BasicBranching.existenceTriangle(20, 45);
        Assertions.assertEquals("Triangle exist - not rectangular", actual);
    }

    @Test
    public void maxOfMinShouldReturnMaxValueWhenIsTwoMinValue() {
        double actual = BasicBranching.maxOfMin(1,4,2,7);
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void positionLineShouldReturnTrueWhenPointsAreLieOnTheSameLine() {
        Assertions.assertTrue(BasicBranching.positionLine(-6,-3,-3,-1,3,3));
    }

    @Test
    public void positionLineShouldReturnFalseWhenPointsAreNotLieOnTheSameLine() {
        Assertions.assertFalse(BasicBranching.positionLine(-6, -3, -3, -1, 3, 1));
    }

    @Test
    public void brickPassingShouldReturnTrueWhenXAndYSmallerHole() {
        Assertions.assertTrue(BasicBranching.brickPassing(4, 5, 3, 4,8));
    }

    @Test
    public void brickPassingShouldReturnTrueWhenYAndZSmallerHole() {
        Assertions.assertTrue(BasicBranching.brickPassing(4, 5, 8, 4,3));
    }

    @Test
    public void brickPassingShouldReturnFalseWhenTwoSidesLargerHoles() {
        Assertions.assertFalse(BasicBranching.brickPassing(4, 5, 8, 4, 9));
    }
}
