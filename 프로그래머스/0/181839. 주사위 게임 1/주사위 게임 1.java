class Solution {
    public int solution(int a, int b) {
        
        String state = (a % 2 != 0 && b % 2 != 0) ? "odds" : (a % 2 == 0 && b % 2 == 0) ? "evens" : "both";

        switch (state) {
            case "odds" : return (int) Math.pow(a, 2) + (int) Math.pow(b, 2);  
            case "evens" : return (int) Math.abs(a - b);
            case "both" : return 2 * (a + b);
        }
        
        return 0;
    }
}