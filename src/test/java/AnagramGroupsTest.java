import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

//@Ignore
public class AnagramGroupsTest {

    @Test
    public void testAnagramGroups1() {
        String [] stArray = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> anagramGroups = AnagramGroups.groupAnagrams(stArray);
        System.out.println(anagramGroups);
    }

    @Test
    public void testAnagramGroups2() {
        String [] stArray = {"",""};
        List<List<String>> anagramGroups = AnagramGroups.groupAnagrams(stArray);
        System.out.println(anagramGroups);
    }

    @Test
    public void testAnagramGroups3() {
        String [] stArray = {"","b"};
        List<List<String>> anagramGroups = AnagramGroups.groupAnagrams(stArray);
        System.out.println(anagramGroups);
    }

    @Test
    public void testAnagramGroups4() {
        String [] stArray = {"b","b"};
        List<List<String>> anagramGroups = AnagramGroups.groupAnagrams(stArray);
        System.out.println(anagramGroups);
    }

    @Test
    public void testAnagramGroups5() {
        String [] stArray = {"and","dan"};
        List<List<String>> anagramGroups = AnagramGroups.groupAnagrams(stArray);
        System.out.println(anagramGroups);
    }


}