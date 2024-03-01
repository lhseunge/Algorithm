import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        
        int multiple = Arrays.stream(num_list).reduce((o1, o2) -> o1 * o2).orElse(0);
        int pow = (int) Math.pow(Arrays.stream(num_list).reduce(Integer::sum).orElse(0), 2);
        
        return multiple < pow ? 1 : 0;
    }
}