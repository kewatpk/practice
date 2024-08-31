import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        String containString = s;
        for (int i = 0; i < s.length(); i++) {
            String [] ts = t.split("");
            if(!containString.contains(ts[i])){
                return false;
            } else {
                containString = containString.replaceFirst(ts[i], "");
            }
        }

        return true;
    }
}
