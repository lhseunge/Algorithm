class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
         
        int idx = 1;
        int loop = 1;

        if ((n * n) % 2 != 0) {
            answer[n / 2][n / 2] = n * n;
        }

        while (idx < n * n) {
            for (int u = loop - 1; u < n - loop; u++) {
                answer[loop - 1][u] = idx++;
            }

            for (int r = loop - 1; r < n - loop; r++) {
                answer[r][n - loop] = idx++;
            }

            for (int d = n - loop; d >= loop; d--) {
                answer[n - loop][d] = idx++;
            }

            for (int l = n - loop; l >= loop; l--) {
                answer[l][loop - 1] = idx++;
            }

            loop++;
        }
        
        return answer;
    }
}