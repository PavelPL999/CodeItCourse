package stream;

import java.util.HashMap;
import java.util.Map;

public class ExerciseLeetCode_01 {

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || target == 0) {
            return new int[]{};
        }

        for (int i = 0; i < nums.length; i++) {
            int element1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int element2 = nums[j];
                if (element1 + element2 == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 22;

        Solution solution = new Solution();
        int[] result = solution.twoSum(numbers, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {

        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int findElement = target - nums[i];
                if(map.containsKey(findElement)) {
                    return new int[] {map.get(findElement), i};
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
}
