import java.util.HashSet;
import java.util.Set;

class Solution {
    
    static Set<Integer> set; // numbers 조합으로 나올 수 있는 숫자들;
    static boolean[] visited = new boolean[7]; // numbers는 길이 1 이상 7 이하인 문자열
    
    public int solution(String numbers) {
        
        int answer = 0;
        set = new HashSet<>();
        dfs(numbers, "", 0);

        // 소수 판별 후 카운팅
        for (Integer num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }

        System.out.println("set = " + set);

        return answer;
    }
    
     public void dfs(String numbers, String s, int depth) {

        // numbers를 전부 탐색했다면 종료
        if (depth > numbers.length()) {
            return;
        }

        // numbers loop
        for (int i = 0; i < numbers.length(); i++) {

            if (!visited[i]) {
                visited[i] = true;
                int numChar = Integer.parseInt(""+ numbers.charAt(i));
                // System.out.println("s + numbers.charAt(i) = " + s + numbers.charAt(i));
                set.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers, s + numbers.charAt(i), depth + 1);
                visited[i] = false;
            }
        }
    }

    public boolean isPrime(Integer n) {
        // 0, 1 은 소수가 아니다.
        if (n < 2) {
            return false;
        }

        // 에라토스테네스 체
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}