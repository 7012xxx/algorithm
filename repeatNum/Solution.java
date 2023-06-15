package repeatNum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        findRepeatNumber(nums);
    }
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)){
                return num;
            }
                set.add(num);
        }
        return -1;
    }
}
