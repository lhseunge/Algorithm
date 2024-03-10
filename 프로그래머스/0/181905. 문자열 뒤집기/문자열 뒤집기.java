class Solution {
    public String solution(String my_string, int s, int e) {
        
        String target = my_string.substring(s, e + 1);
        
        String reverse = new StringBuilder(target).reverse().toString();
        
        return my_string.replace(target, reverse);
    }
}