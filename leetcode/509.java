class Solution {
    public int fib(int n) {
        int[] fibs = new int[n + 2];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i <= n; i++) fibs[i] = fibs[i - 1] + fibs[i - 2];
        return fibs[n];
    }
}