import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map(x -> {
            if (x >= 50 && x % 2 == 0) {
                return x / 2;
            } else if (x < 50 && x % 2 != 0) {
                return x * 2;
            }
            return x;
        }).toArray();
    }
}