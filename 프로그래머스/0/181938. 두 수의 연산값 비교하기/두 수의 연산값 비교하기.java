class Solution {
    public int solution(int a, int b) {

        int resultA = Integer.parseInt("" + a + b);
        int resultB = 2 * a * b;
        
        return resultA == resultB ? resultA : resultA > resultB ? resultA : resultB;
    }
}