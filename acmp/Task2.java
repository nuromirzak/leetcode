import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = Math.min(1, n); i <= Math.max(n, 1); i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}