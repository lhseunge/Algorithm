class Solution {
    public String solution(String code) {
        
        String answer = "";
        int mode = 0;
        String[] codeArr = code.split("");
        boolean isOdd = true;
        boolean isCodeEq1 = true;
        
        for (int i = 0; i < code.length(); i++) {
            isOdd = i % 2 != 0;
            isCodeEq1 = "1".equals(codeArr[i]);
            
            if (mode == 0 && !isCodeEq1 && !isOdd) {
                answer += codeArr[i];
                continue;
            }
            
            if (mode == 1 && !isCodeEq1 && isOdd) {
                answer += codeArr[i];
                continue;
            }

            
            if (isCodeEq1){
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
                
        }
        
        return !answer.isEmpty() ? answer : "EMPTY";
    }
}