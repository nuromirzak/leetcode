import java.util.*;

class Task65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orig = sc.next();
        int n = sc.nextInt();
        int[] dists = new int[n];
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String message = sc.next();
            dists[i] = hammingDist(orig, message);
            minDist = Math.min(minDist, dists[i]);
        }

        int ans = 0;
        for (int dist : dists) {
            if (dist == minDist) {
                ans++;
            }
        }

        System.out.println(ans);
        for (int i = 0; i < dists.length; i++) {
            int dist = dists[i];
            if (dist == minDist) {
                System.out.print(i + 1 + " ");
            }
        }
    }

    private static int hammingDist(String s1, String s2) {
        int n = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                n++;
            }
        }
        return n;
    }
}