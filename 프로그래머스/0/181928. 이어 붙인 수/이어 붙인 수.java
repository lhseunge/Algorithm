import java.util.Arrays;
import java.util.stream.Collectors;


class Solution {
    public int solution(int[] num_list) {
        int resultA = Integer.parseInt(
            Arrays.stream(Arrays.stream(num_list)
                          .filter(x -> x % 2 != 0)
                          .toArray())
            .mapToObj(String::valueOf)
            .collect(Collectors.joining()));
    
        int resultB = Integer.parseInt(
            Arrays.stream(Arrays.stream(num_list)
                          .filter(x -> x % 2 == 0)
                          .toArray())
            .mapToObj(String::valueOf)
            .collect(Collectors.joining()));

        return resultA + resultB;
    }
}