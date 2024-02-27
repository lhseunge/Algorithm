class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int resultA = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int resultB = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        answer = Math.max(resultA, resultB);

        return answer;
    }
}