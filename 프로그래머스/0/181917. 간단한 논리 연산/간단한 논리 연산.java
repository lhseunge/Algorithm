class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

        Boolean case1 = Boolean.logicalOr(x1, x2);
        Boolean case2 = Boolean.logicalOr(x3, x4);
        
        return Boolean.logicalAnd(case1, case2);
    }
}