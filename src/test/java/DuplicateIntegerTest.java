import org.junit.*;


public class DuplicateIntegerTest {
    @Test
    public void duplicateInteger() {
        int[] arr = {1, 2, 3, 3};
        boolean isDuplicate = DuplicateInteger.hasDuplicate(arr);
        Assert.assertTrue(isDuplicate);
    }

    @Test
    public void duplicateInteger2() {
        int[] arr = {1, 2, 3, 4};
        boolean isDuplicate = DuplicateInteger.hasDuplicate(arr);
        Assert.assertFalse(isDuplicate);
    }
}