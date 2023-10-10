import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));
            
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            
            prevValue = currValue;
        }
        
        return result;
    }

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        
        System.out.println(romanToInt(s1)); // Output: 3
        System.out.println(romanToInt(s2)); // Output: 58
        System.out.println(romanToInt(s3)); // Output: 1994
    }
}
