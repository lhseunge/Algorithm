import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        if (myString.charAt(myString.length() - 1) == 'x') myString += " ";
        return Arrays.stream(myString.split("x")).map(String::trim).mapToInt(String::length).toArray();
    }
}