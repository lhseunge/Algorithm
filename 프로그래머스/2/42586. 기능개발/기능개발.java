import java.util.*;

class Solution {
        public List<Integer> solution(int[] progresses, int[] speeds) {

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) Math.ceil((double) (100 - progresses[i]) / speeds[i])); // 걸리는 시간
        }

        int date = queue.poll();
        int count = 1; // 동시배포 가능한 기능 수 

        while (!queue.isEmpty()) {
            
            // 기능 1 개발일이 기능 2 개발일보다 느리면 그건 먼저 배포
            if (date < queue.peek()) {
                result.add(count);
                count = 1;
                date = queue.poll();

            // 기능 1 개발일이 기능 2 개발일보다 빠르거나 같으면 동시에 배포 가능
            } else {
                count++;
                queue.poll();
            }

        }
        result.add(count);

        return result;
    }

}