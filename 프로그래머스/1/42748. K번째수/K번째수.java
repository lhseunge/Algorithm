import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        List<Integer> answerList = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
                
        for (int[] command : commands) {
            
            for (int i : Arrays.copyOfRange(array, command[0] - 1, command[1]))
                subList.add(i);

            subList.sort((o1, o2) -> o1 - o2);
            
            answerList.add(subList.get(command[2] - 1));
            
            subList.clear();
        } 
                                                                      
        return answerList.stream().mapToInt(x -> x).toArray();
    }
}