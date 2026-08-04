import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            int first = nums[i];
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {

                int sum = first + nums[start] + nums[end];

                if (sum == target) {
                    return target;
                }

                if (Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    ans = sum;
                }

                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return ans;
    }
}