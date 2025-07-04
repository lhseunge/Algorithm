import java.util.*;

class Solution {
    
    boolean solution(String s) {

        Queue<String> queue = new LinkedList<>();

        String[] sArray = s.split("");

        for (String string : sArray) {
            if (string.equals(")")) {
                if (isEmptyQueue(queue)) {
                    return false;
                } else {
                    queue.poll();
                }
            } else {
                queue.add(string);
            }

        }

        return isEmptyQueue(queue);
    }

    private boolean isEmptyQueue(Queue<String> queue) {

        return queue.isEmpty();
    }

}