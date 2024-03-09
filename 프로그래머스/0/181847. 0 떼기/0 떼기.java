class Solution {
    public String solution(String n_str) {
        
        String[] nArr = n_str.split("");

        for (int i = 0; i < nArr.length; i++) {
            if (nArr[i].equals("0")) nArr[i] = "";
            else break;
        }
        
        return String.join("", nArr);
    }
}