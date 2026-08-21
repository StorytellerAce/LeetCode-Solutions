public class Q12_IntToRoman {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < values.length; i++){
            while(num >= values[i]){
                num -= values[i];
                ans.append(symbols[i]);
            }
        }

        return ans.toString();
    }

    public String intToRoman2(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder ans = new StringBuilder();
        
        ans.append(thousands[num/1000]);
        num %= 1000;

        ans.append(hundreds[num/100]);
        num %= 100;

        ans.append(tens[num/10]);
        num %= 10;

        ans.append(ones[num]);
        
        return ans.toString();
    }   
}
