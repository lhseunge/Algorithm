import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {

        int[] pattern1 = {1,2,3,4,5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0,0,0};

        for(int i=0; i<answers.length; i++){

            // 1 == 1 / 5 나머지 패턴 1의 1 / 5의 나머지

            // 0 % 5 == 몫 0 나머지 0 0은 나눌 수 없음 
            // 1 % 5 == 몫 0 나머지 1
            // ... 
            // 4 % 5 == 몫 0 나머지 4

            if(answers[i] == pattern1[i % 5]) score[0]++;
            if(answers[i] == pattern2[i % 8]) score[1]++;
            if(answers[i] == pattern3[i % 10]) score[2]++;
        }

        List<Integer> answerList = new ArrayList<Integer>();
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        for(int i = 0; i < 3; i++){
            if(max == score[i]) answerList.add(i+1);
        }
    
        return answerList.stream().mapToInt(Integer::intValue).toArray();

    }
}