import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if (arr2.length > arr1.length) {
            return -1;
        } else if (arr1.length > arr2.length) {
            return 1;
        } else {
            return Arrays.stream(arr2).sum() > Arrays.stream(arr1).sum() ? -1 :
                   Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : 0;
        }

    }
}