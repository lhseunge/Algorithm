import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" ")).filter(x -> x.length() > 0).toArray(String[]::new);
    }
}