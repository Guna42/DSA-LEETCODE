import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;

        char[] schars = s.toCharArray();
        char[] tchars= t.toCharArray();

        Arrays.sort(schars);
        Arrays.sort(tchars);

        return Arrays.equals(schars,tchars);
        
    }
}