import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> nList = new ArrayList<>();

        nList.add(n);
        
        do {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n++;
            }
            
            nList.add(n);
        } while (nList.get(nList.size() - 1) != 1);
        
        return nList.stream().mapToInt(Integer::intValue).toArray();
    }
}