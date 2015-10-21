package n3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<Character, Integer>();
        int longest = 0;

        for (int i = 0 ; i < s.length() ; i++) {
            Integer index = charIndexMap.get(s.charAt(i));
            if (index == null) {
                charIndexMap.put(s.charAt(i), i);
            }
            else {
                longest = Math.max(charIndexMap.size(), longest);
                charIndexMap.clear();
                i = index;
            }
        }
        longest = Math.max(charIndexMap.size(), longest);
        return longest;
    }
}