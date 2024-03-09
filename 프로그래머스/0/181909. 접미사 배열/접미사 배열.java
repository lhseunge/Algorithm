import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        
        String[] answer = new String[my_string.length()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string;
            my_string = my_string.substring(1, my_string.length());
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}