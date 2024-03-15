import java.util.Arrays;

class Solution {
    
    int[] answer = {};
    
    public int[] solution(int[] arr, int k) {
        answer = new int[k];
        Arrays.fill(answer, -1);
        
        arr = Arrays.stream(arr)
            .distinct()
            .toArray();
        
        
        if (k > arr.length) {
            arrMap(answer, arr, arr.length);
        } else {
            arrMap(answer, arr, k);
        }
        
        return answer;
    }
    
    private void arrMap(int[] answer, int[] fillArr, int idx) {
        
        for (int i = 0; i < idx; i++) 
            answer[i] = fillArr[i];
        
    }
}