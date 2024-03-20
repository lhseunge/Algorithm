import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        String temp;
        int idx = 0;
        
        for (String s : picture) {
            // temp += String.valueOf(s.);
            for (int i = 0; i < k; i++) {
                answer[idx] = Arrays.stream(s.split(""))
                                          .map(x -> x = x.repeat(k))
                                          .collect(Collectors.joining());   
                
                idx++;
            }             
            
        }
        
        return answer;
    }
}