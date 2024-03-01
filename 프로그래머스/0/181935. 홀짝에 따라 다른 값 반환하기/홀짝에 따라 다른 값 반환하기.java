import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> numList = new ArrayList<>();
        
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) numList.add(i);
            }

        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) numList.add((int) Math.pow(i, 2));
            }
        }
       
        return numList.stream().mapToInt(x->x).sum();
    }
}