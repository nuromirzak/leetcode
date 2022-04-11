class Solution {
    List<List<Integer>> subsets = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        permute(0, new ArrayList<Integer>(), nums);
        return subsets;
    }

    private void permute(int pos, List<Integer> subset, int[] nums) {
        if (pos == nums.length) {
            subsets.add(new ArrayList(subset));
            return;
        }
        permute(pos + 1, subset, nums);
        subset.add(nums[pos]);
        permute(pos + 1, subset, nums);
        subset.remove(subset.size() - 1);
    }
}