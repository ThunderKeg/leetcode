package n17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    private static final String[] MAPPING = new String[]{
            " ", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz", // 9
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return Collections.EMPTY_LIST;
        }
        List<String> current = new ArrayList<String>(1);
        current.add(0, "");
        for (int i = 0 ; i < digits.length() ; i++) {
            List<String> next = new ArrayList<String>(current.size() * 4);
            int index = digits.charAt(i) - '0';
            if (MAPPING[index].length() == 0) {
                continue;
            }
            for (String str : current) {
                for (int charIndex = 0 ; charIndex < MAPPING[index].length() ; charIndex++) {
                    next.add(str + MAPPING[index].charAt(charIndex));
                }
            }
            current = next;
        }
        return current;
    }
}
