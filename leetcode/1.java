class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];

            if (set.contains(toFind)) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == toFind) {
                        return new int[]{j, i};
                    }
                }
            }

            set.add(nums[i]);
        }

        return new int[]{};
    }
}