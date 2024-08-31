import junit.framework.TestCase;

import java.util.Arrays;

public class TwoIntegerSumTest extends TestCase {

    public void testTwoSum() {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 9;
        int[] output = TwoIntegerSum.twoSum(intArray, target);
        assertEquals(2, output.length);
        assertEquals(intArray[output[0]] + intArray[output[1]], target);
    }
}