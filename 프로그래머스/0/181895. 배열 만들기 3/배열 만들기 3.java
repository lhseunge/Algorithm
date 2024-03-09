import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        int[] arrA = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] arrB = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        int[] result = new int[arrA.length + arrB.length];
        
        for (int i = 0; i < arrA.length; i++) {
            result[i] = arrA[i];
        }

        for (int i = 0; i < arrB.length; i++) {
            result[i + arrA.length] = arrB[i];
        }
        
        return result;
    }
}