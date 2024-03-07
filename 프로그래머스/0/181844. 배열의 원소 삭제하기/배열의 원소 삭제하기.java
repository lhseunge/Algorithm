import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr)
            .filter(remain_arr -> Arrays.stream(delete_list)
                    .noneMatch(del_arr -> del_arr == remain_arr))
            .toArray();
    }
}