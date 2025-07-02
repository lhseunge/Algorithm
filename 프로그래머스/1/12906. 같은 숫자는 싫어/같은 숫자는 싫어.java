import java.util.*;

public class Solution {
    public List<Integer> solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {

            if (stack.isEmpty() || stack.peek() != i) {
                stack.push(i);
            }
            
        }

        return stack;

    }
}