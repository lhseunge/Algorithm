import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        arr = Arrays.stream(arr)
            .distinct()
            .toArray();
        
        
        if (k > arr.length) {
            answer = arrMap(answer, arr, arr.length);
        } else {
            answer = arrMap(answer, arr, k);
        }
        
        
        
        return answer;
    }
    
    private int[] arrMap(int[] answer, int[] fillArr, int idx) {
        for (int i = 0; i < idx; i++) {
                answer[i] = fillArr[i];
        }
        
        return answer;
    }
}