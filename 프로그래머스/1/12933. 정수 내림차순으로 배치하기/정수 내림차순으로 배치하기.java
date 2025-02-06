import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {

        return Long.valueOf(Arrays.stream(String.valueOf(n)
                .split(""))
                .sorted((o1, o2) -> Long.valueOf(o2).compareTo(Long.valueOf(o1)))
                .collect(Collectors.joining()));
    }
}