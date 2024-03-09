class Solution {
    public int solution(String binomial) {
        
        String[] parts = binomial.split(" ");
        
        switch (parts[1]) {
            case "+" : return Math.addExact(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]));
            case "-" : return Math.subtractExact(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]));
            case "*" : return Math.multiplyExact(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]));
        }        

        return 0;
    }
}