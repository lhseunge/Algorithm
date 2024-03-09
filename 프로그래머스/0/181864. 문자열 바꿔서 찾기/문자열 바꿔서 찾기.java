import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public int solution(String myString, String pat) {
        return myString.contains(Stream.of(pat.split("")).map(str -> "A".equals(str)?"B":"A").collect(Collectors.joining()))?1:0;

    }
}