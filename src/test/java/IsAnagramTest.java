import org.junit.*;

import java.util.Locale;
import java.util.Scanner;
@Ignore
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
    @Test
    public void testIsAnagram4() {
        boolean isAnagram = IsAnagram.isAnagram("", "");
        Assert.assertTrue(isAnagram);
    }

    @Test
    public void testIsAnagram5() {
        boolean isAnagram = IsAnagram.isAnagram("c", "c");
        Assert.assertTrue(isAnagram);
    }

    @Test
    public void testIsAnagram6() {
        boolean isAnagram = IsAnagram.isAnagram("", "b");
        Assert.assertFalse(isAnagram);
    }

    @Test
    public void testIsAnagram7() {
        boolean isAnagram = IsAnagram.isAnagram("b", "");
        Assert.assertFalse(isAnagram);
    }

}
