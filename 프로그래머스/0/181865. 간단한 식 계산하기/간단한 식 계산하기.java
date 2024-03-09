class Solution {
    public int solution(String binomial) {
        
        String[] parts = binomial.split(" ");
        
        switch (parts[1]) {
            case "+" : return Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]);
            case "-" : return Integer.parseInt(parts[0]) - Integer.parseInt(parts[2]);
            case "*" : return Integer.parseInt(parts[0]) * Integer.parseInt(parts[2]);
        }        

        return 0;
    }
}