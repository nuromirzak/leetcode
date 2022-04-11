import java.util.Arrays;
import java.util.Scanner;

class Task869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int l = 0, r = n - 1, ans = 0;

        while (l <= r) {
            if (arr[l] + arr[r] <= d) {
                l++;
            }
            r--;
            ans++;
        }

        System.out.println(ans);
    }
}