class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equalsIgnoreCase(">") && eq.equalsIgnoreCase("!")) {
            if (n > m) return 1;
        } else if (ineq.equalsIgnoreCase(">") && eq.equalsIgnoreCase("=")) {
            if (n >= m) return 1;
        } else if (ineq.equalsIgnoreCase("<") && eq.equalsIgnoreCase("!")) {
            if (n < m) return 1;
        } else if (ineq.equalsIgnoreCase("<") && eq.equalsIgnoreCase("=")) {
            if (n <= m) return 1;
        }
        return 0;
    }
}