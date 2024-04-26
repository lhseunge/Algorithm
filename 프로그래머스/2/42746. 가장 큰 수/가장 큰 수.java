import java.util.*;

class Solution {
    public String solution(int[] numbers) {

        String[] stringNumbers = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) 
            stringNumbers[i] = String.valueOf(numbers[i]);

        Arrays.sort(stringNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if (stringNumbers[0].equals("0"))
            return "0";
        
        return String.join("", stringNumbers);

    }
}