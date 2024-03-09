class Solution {
    public int solution(String myString, String pat) {
        
        StringBuilder sb = new StringBuilder();
        
        for (char s : myString.toCharArray()) {
            if (s == 'A') sb.append("B");
            else sb.append("A");
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
    }
}