package Java;

import java.util.List;

public class Q22_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new java.util.ArrayList<>();

        backtrack(new StringBuilder(), n, 0, 0, result);
        
        return result;
    }

    public void backtrack(StringBuilder sb, int n, int open, int close, List<String> result){
        // base case
        if (sb.length() == 2 * n){
            result.add(sb.toString());
            return;
        }

        // open branch
        if (open < n){
            sb.append("(");
            backtrack(sb, n, open+1, close, result);
            // backtrack the change
            sb.deleteCharAt(sb.length()-1);
        }

        if (close < open){
            sb.append(")");
            backtrack(sb, n, open, close+1, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
