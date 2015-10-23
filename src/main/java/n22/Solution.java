package n22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        return generateInner(0, n, new StringBuilder(n), new ArrayList<String>((int)(Math.pow(n, 2) + 1)));
    }

    private List<String> generateInner(int unmatchedLeftParenthesis, int parenthesisLeft, StringBuilder current, List<String> res) {
        if (parenthesisLeft == 0) {
            res.add(current.toString());
            return res;
        }
        if (unmatchedLeftParenthesis > 0) {
            generateInner(unmatchedLeftParenthesis - 1, parenthesisLeft - 1, current.append(')'), res);
            current.deleteCharAt(current.length() - 1);
        }
        if (unmatchedLeftParenthesis < parenthesisLeft) {
            generateInner(unmatchedLeftParenthesis + 1, parenthesisLeft, current.append('('), res);
            current.deleteCharAt(current.length() - 1);
        }
        return res;
    }

}