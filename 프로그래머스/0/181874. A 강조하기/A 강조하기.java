class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : myString.split("")) {
            if (s.equals("a")) s = s.toUpperCase();
            sb.append(s);
        } 
        
        return sb.toString();
    }
}