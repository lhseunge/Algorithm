import java.util.*;

public class Solution {
    public List<Integer> solution(int[] arr) {

        List<Integer> result = new ArrayList<>();

        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (result.get(result.size() - 1) != arr[i]) {
                result.add(arr[i]);
            }

        }

        return result;

    }
}