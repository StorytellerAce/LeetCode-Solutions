package Java;

import java.util.Stack;

public class Q67_AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder answer = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){
            int aDigit = 0;
            int bDigit = 0;
            if (i >= 0)
                aDigit = a.charAt(i) - '0';
            if (j >= 0)
                bDigit = b.charAt(j) - '0';
            int result = aDigit + bDigit + carry;
            int resultDigit = result % 2;
            carry = result / 2;
            answer.append((char)(resultDigit + '0'));
            i --;
            j --;
        }
        return answer.reverse().toString();
    }
}
