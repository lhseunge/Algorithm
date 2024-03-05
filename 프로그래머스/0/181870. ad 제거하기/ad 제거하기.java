import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(x -> !x.contains("ad")).toArray(String[]::new);
    }
}