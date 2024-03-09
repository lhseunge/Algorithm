import java.util.Arrays;

class Solution {
    public String solution(String my_string, int m, int c) {
        
        StringBuilder sb = new StringBuilder();

        while (my_string.length() != 0) {
            sb.append(my_string.substring(0, m).charAt(c - 1));
            my_string = my_string.substring(m);
        }
        
        return sb.toString();

    }
}