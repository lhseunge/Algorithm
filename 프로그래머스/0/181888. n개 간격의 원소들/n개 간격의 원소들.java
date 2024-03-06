import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) result.add(num_list[i]);
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
        
    }
}