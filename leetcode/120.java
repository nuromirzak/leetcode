class Solution {
    //    Top Down Solution
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 1; i < triangle.size(); i++) {

            var prev = triangle.get(i - 1);
            var cur = triangle.get(i);

            for (int j = 0; j < cur.size(); j++) {
                if (j == 0) {
                    cur.set(0, cur.get(0) + prev.get(0));
                } else if (j == i) {
                    cur.set(j, cur.get(j) + prev.get(j - 1));
                } else {
                    cur.set(j, cur.get(j) + Math.min(prev.get(j - 1), prev.get(j)));
                }
            }
        }

        return Collections.min(triangle.get(triangle.size() - 1));
    }
}