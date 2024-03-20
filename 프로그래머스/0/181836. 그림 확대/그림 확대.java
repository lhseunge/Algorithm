import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        for (String s : picture) {
            for (int i = 0; i < k; i++) {
                answer[idx] = String.join("", Arrays.stream(s.split(""))
                                          .map(x -> x = x.repeat(k))
                                          .toArray(String[]::new));   
                
                idx++;
            }             
        }
        
        return answer;
    }
}