class Solution {
    public String[] solution(String[] names) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < names.length; i++) {
           if (i % 5 == 0) {
               sb.append(names[i]).append(" ");
           }
        }
        
        return sb.toString().split(" ");
    }
}