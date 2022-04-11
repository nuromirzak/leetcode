import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        for (int x = -100; x <= 100; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.print(x + " ");
            }
        }
    }
}