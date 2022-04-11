import java.util.Scanner;
import java.util.TreeSet;

class Task385 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n * 2];
        TreeSet<Double> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ans[i * 2] = x;
            ans[i * 2 + 1] = y;

            for (int j = 0; j < i; j++) {
                double dist = Math.sqrt((ans[i * 2] - ans[j * 2]) * (ans[i * 2] - ans[j * 2])
                    + (ans[i * 2 + 1] - ans[j * 2 + 1]) * (ans[i * 2 + 1] - ans[j * 2 + 1]));
                treeSet.add(dist);
            }

        }

        System.out.println(treeSet.size());
        for (Double d : treeSet) {
            System.out.println(d);
        }
    }
}