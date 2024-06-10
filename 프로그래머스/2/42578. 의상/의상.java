import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {

        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();

        for (String[] clothe : clothes) {
            String type = clothe[1];
            hm.put(type, hm.getOrDefault(type, 0) + 1);
        }

        for (Integer integer : hm.values()) {
            answer *= integer + 1;
        }

        return answer - 1;
    }
}