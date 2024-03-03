class Solution {
    public int solution(String my_string, String is_suffix) {    
        
        if (is_suffix.length() > my_string.length()) return 0; 
        
        return my_string.substring(my_string.length() - is_suffix.length()).equalsIgnoreCase(is_suffix) ? 1 : 0;
    }
}