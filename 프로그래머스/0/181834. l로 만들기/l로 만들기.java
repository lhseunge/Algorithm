import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        
        return Arrays.stream(myString.split("")).map(x-> {
            if ('l' > x.charAt(0)) return "l";
            return x;
        }).collect(Collectors.joining());
        
    }
}