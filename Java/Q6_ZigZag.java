package Java;

public class Q6_ZigZag {
    public String convert(String s, int numRows) {
            if (numRows == 1) return s;
           int interval = 2 * (numRows - 1);
           StringBuilder result = new StringBuilder();

           for (int i = 0; i < numRows; i ++){
                int jump2 = 2 * i;
                int jump1 = interval - jump2;

                int j = i;
                while (j < s.length()){
                    result.append(s.charAt(j));
                    if (jump1 == 0 || jump2 == 0 ){
                        j += (jump1 == 0? jump2 : jump1);
                    }
                    else{
                        j += jump1;
                        if (j < s.length()){
                            result.append(s.charAt(j));
                            j += jump2;
                        }
                    }
                }
           }
           return result.toString();
    }
}
