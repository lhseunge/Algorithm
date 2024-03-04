import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        
        int[] odds = Arrays.copyOf(num_list, num_list.length);
        int[] evens = Arrays.copyOf(num_list, num_list.length);
        int oddSum;
        int evenSum;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                odds[i] = 0;
            } else {
                evens[i] = 0;
            }
        }
        
        oddSum = Arrays.stream(odds).sum();
        evenSum = Arrays.stream(evens).sum();
        
        return (oddSum >= evenSum) ? oddSum : evenSum;
        
    }
}