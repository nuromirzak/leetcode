class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0, noZero = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[noZero];
                nums[noZero] = nums[i];
                nums[i] = temp;
                noZero++;
            }
        }
    }
}