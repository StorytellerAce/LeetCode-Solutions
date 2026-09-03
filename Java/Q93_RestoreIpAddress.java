import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List <String> result = new ArrayList<>();
        backtrack(s, new StringBuilder(), 0, 0, result);
        return result;
    }

    // index stands for the first untaken character, at end, index = s.length
    public void backtrack(String s, StringBuilder currentAns, int integerFound, int index, List<String>result){
        // base case 1: if the number of numbers left cannot all be used to form the left integer count 
        // (ie, 7 number left when 2 more integer needed only)
        if ((s.length() - index) > (4-integerFound) * 3)
            // impossible route, retreat
            return;

        // base case 2: 4 integer found
        if (integerFound == 4){
            // success case
            if (index == s.length())
                result.add(currentAns.toString());

            // failed case, no use all numbers - ntg happens, end
            return;
        }

        // branches
        for (int i = 1; i <= 3; i++){
            if ((s.length() - index) >= i){
                int newInt = Integer.parseInt(s.substring(index, index+i));

                if (newInt <= 255){
                    int originalLength = currentAns.length();
                    if (currentAns.length() > 0)
                        currentAns.append(".");
                    currentAns.append(Integer.toString(newInt));
                    backtrack(s, currentAns, integerFound+1, index+i, result);
                    currentAns.delete(originalLength, currentAns.length());
                }
                
                // prevent 0 as header
                if (i == 1 && newInt == 0){
                    break;
                }
            }
        }
    }
}