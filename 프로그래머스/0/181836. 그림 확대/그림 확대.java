import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for (String pic : picture) {
            for (String s : pic.split("")) 
                sb.append(s.repeat(k));
            
            for (int i = 0; i < k; i++) {
                answer[idx] = sb.toString();
                
                idx++;
            }
            sb.setLength(0);
        }
        
        return answer;
    }
}