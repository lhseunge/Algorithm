import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b, int c) {
        
        long count = IntStream.of(a, b, c).distinct().count();
        
        if (count == 1) {
            return (a + b + c) * 
                ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2)) * 
                ((int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3));
        } else if (count == 2) {
            return (a + b + c) * 
                ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2));
        } else {
            return (a + b + c);
        }   
    }
}