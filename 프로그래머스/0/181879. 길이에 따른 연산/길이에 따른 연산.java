import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if (num_list.length >= 11) {
            answer = Arrays.stream(num_list).sum();
        } else {
            answer = Arrays.stream(num_list).reduce((x, y) -> x * y).getAsInt();
        }
        
        return answer;
    }
}