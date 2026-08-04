package Java;
//Q3 – Given an array of number like {1111, 2312, 3434, 1234}, sort the array based on the number of permutations. (7 marks) 

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        int[] arrays = { 1234, 2222, 4234, 3232 };
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int n : arrays) {
            String s = String.valueOf(n);
            map.put(n, countUniqueDigits(s));
        }
    }

    public static int countUniqueDigits(String s) {
        Set<Character> seenCharacters = new HashSet<Character>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (seenCharacters.add(c)) // can add means unique
                count++;
        }
        return count;
    }

    public static int factorial(int n){
        int to
    }
}
