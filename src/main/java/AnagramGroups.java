import java.util.*;

public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<Integer, String > map = new HashMap<>();
        Map<Integer, String > map2 = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            map.put(i, strs[i]);
            map2.put(i, strs[i]);
        }
        for (int i = 0; i < map.size(); i++) {
            List<String> temp = new ArrayList<>();
            String s1 = map.get(i);
            temp.add(s1);
            for(int j = i; j < map.size(); j++) {
                String s2 = map.get(j);
                if (s2!= null) {
                    boolean isAnagram = isAnagram(s1,s2);
                    if (isAnagram) {
                        temp.add(s2);
                        map.remove(j);
                    }
                }
                map.remove(i);
            }


            ans.add(temp);
        }
        return ans;
    }

    private static boolean isAnagram(String s, String t) {
        String containString = s;
        if (!Objects.equals(t.length(), s.length())) {
            return false;
        }
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

/*
 if (strs.length >1) {
        for (int i = 0; i < targets.size(); i++){
List<String> temp = new ArrayList<>();
                temp.add(targets.get(i));
String s1 = targets.get(i);
String s3 = strs[strs.length-1];
                if (strs.length ==2){
boolean isannagram= isAnagram(s1, s3);
                    if (isannagram && (Objects.equals(s1, s3) || Objects.equals(s1, "") && Objects.equals(s3, ""))){
        ans.add(Arrays.asList(strs));
        return ans;
                    } else if (!isannagram && !Objects.equals(s1, s3)){
        ans.add(temp);
                        ans.add(Collections.singletonList(s3));
        return ans;
                    } else {
                            temp.add(s3);
                        ans.add(temp);
                        return ans;
                    }
                            }

                            for (int j = i; j < targets.size(); j++){
String s2 = targets.get(j);
                    if (s1.equals(s2)) {
        continue;
        }
boolean isAnagram = isAnagram(s1, s2);
                    if (isAnagram){
        temp.add(s2);
                        targets.remove(j);
j--;
        }
        }
        ans.add(temp);
            }
                    } else {
                    ans.add(List.of(strs));
        }
        return ans;
*/

