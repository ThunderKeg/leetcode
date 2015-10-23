package n5;

public class Solution { 
    public String longestPalindrome(String s) {
        int longest = 0;
        int longestBegin = 0;
        int longestEnd = 0;
        for (int mid = 0 ; mid < s.length() ; mid++) {
            int mid1 = mid;
            int tempSize = findLongest(s, mid1, mid1);

            int size = tempSize * 2 + 1;
            int beg = mid1 - tempSize;
            int end = mid1 + tempSize;
            if (mid1 + 1 < s.length() && s.charAt(mid1) == s.charAt(mid1 + 1)) {
                tempSize = findLongest(s, mid1, mid1 + 1);
                int size2 = tempSize * 2 + 2;
                if (size2 > size) {
                    beg = mid1 - tempSize;
                    end = mid1 + 1 + tempSize;
                    size = size2;
                }
            }
            if (longest < size) {
                longest = size;
                longestBegin = beg;
                longestEnd = end;
            }
        }

        return s.substring(longestBegin, longestEnd + 1);

    }

    private int findLongest(String s, int mid1, int mid2) {
        for (int size = 1; size < s.length() ; size++) {
            mid1--;
            mid2++;
            if (mid1 < 0 || mid2 >= s.length()) {
                return size - 1;
            }
            if (s.charAt(mid1) != s.charAt(mid2)) {
                return size - 1;
            }
        }
        if (s.length() == 1) {
            return 0;
        }
        return s.length();
    }

}