import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> numList = new ArrayList<>();
        
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                
                numList.add(num);
            }
        }

        
        return numList.stream().mapToInt(Integer::valueOf).toArray();
        
    }
}