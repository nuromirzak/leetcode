class Solution {
    //    Bottom Up Solution
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> prev = triangle.get(i + 1);
            List<Integer> cur = triangle.get(i);
            for (int j = 0; j < cur.size(); j++) {
                cur.set(j, Math.min(prev.get(j), prev.get(j + 1)) + cur.get(j));
            }
        }

        return triangle.get(0).get(0);
    }
}