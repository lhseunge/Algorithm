import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {

        List<Integer> nums = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        if (nums.get(nums.size() - 1) > nums.get(nums.size() - 2)) {
            nums.add(nums.get(nums.size() - 1) - nums.get(nums.size() - 2));
        } else {
            nums.add(nums.get(nums.size() - 1) * 2); 
        }
        
        return nums.stream().mapToInt(x->x).toArray();
    }
}