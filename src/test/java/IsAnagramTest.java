import org.junit.*;
public class IsAnagramTest {
    @Test
    public void testIsAnagram1() {
        boolean isAnagram = IsAnagram.isAnagram("racecar", "carrace");
        Assert.assertTrue(isAnagram);
    }

    @Test
    public void testIsAnagram2() {
        boolean isAnagram = IsAnagram.isAnagram("jar", "jam");
        Assert.assertFalse(isAnagram);
    }

    @Test
    public void testIsAnagram3() {
        boolean isAnagram = IsAnagram.isAnagram("ccbc", "bbcc");
        Assert.assertFalse(isAnagram);
    }
}
