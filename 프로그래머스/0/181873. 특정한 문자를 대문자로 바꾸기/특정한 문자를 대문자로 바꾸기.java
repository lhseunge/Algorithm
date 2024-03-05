import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, String alp) {

        my_string = Arrays.stream(my_string.split("")).map(x -> {
            if (x.equalsIgnoreCase(alp)) return x.toUpperCase();
            return x;
        }).collect(Collectors.joining());
        
        return my_string;
    }
}