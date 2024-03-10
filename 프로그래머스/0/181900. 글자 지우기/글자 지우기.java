class Solution {
    public String solution(String my_string, int[] indices) {
        
        String[] my_strings = my_string.split("");
        
        for (int i : indices) {
            my_strings[i] = "";
        }
        
        return String.join("", my_strings);
    }
}