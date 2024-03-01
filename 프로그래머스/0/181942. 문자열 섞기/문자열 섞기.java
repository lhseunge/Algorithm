class Solution {
    public String solution(String str1, String str2) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i <= str1.length() - 1; i++) {
            sb.append(String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i)));
        }
        
        return sb.toString();
    }
}