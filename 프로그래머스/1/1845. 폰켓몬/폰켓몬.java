import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> poke = new HashSet<>();
        
        for (int num : nums) {
            poke.add(num);
        }
        
        if (poke.size() > nums.length / 2) {
            return nums.length / 2;
        } else {
            return poke.size();
        }
    }
}