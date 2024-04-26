class Solution {
    
    int count = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, 0, target, 0);

        return count;
    }
    
    public void dfs(int[] numbers, int depth, int target, int result) {
        
        // 주어진 깊이 까지 탐색을 완료했을 때
        if (depth == numbers.length) {

            // 결과값이 타겟 넘버와 일치할 경우 
            if (result == target) {
                
                // 횟수 카운트  
                count++;
            }
            
            // 탐색 종료
            return;
        }
        
        
        int plus = result + numbers[depth];
        int minus = result - numbers[depth];
        
        dfs(numbers, depth + 1, target, plus);
        dfs(numbers, depth + 1, target, minus);
        
    }
    
    
}