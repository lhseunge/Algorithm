import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        HashSet<Integer> hIndex = new HashSet<>();
        
        citations = Arrays.stream(citations)
            .boxed()
            .sorted((o1, o2) -> o2 - o1)
            .mapToInt(x->x)
            .toArray();
        
        for (int citation : citations) {
            
            int reportCount = (int) Arrays.stream(citations)
                    .filter(i -> i >= citation)
                    .count();
            
            if (citation > reportCount) {
                hIndex.add(reportCount);
            } else { 
                hIndex.add(citation);
            }
            
        }
        
        return Collections.max(hIndex);
    }
}