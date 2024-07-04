import java.util.Scanner;

public class Main {
    static int[] memo;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        memo = new int[n + 1];
        System.out.println(recursive(n));
    }

    public static int recursive(int n) {
        if (n == 1 || memo[n] != 0) {
            return memo[n];
        } else {
            if (n % 3 == 0 && n % 2 == 0) {
                memo[n] = Math.min(recursive(n - 1), Math.min(recursive(n / 3), recursive(n / 2))) + 1;
            } else if (n % 3 == 0) {
                memo[n] = Math.min(recursive(n / 3), recursive(n - 1)) + 1;
            } else if (n % 2 == 0) {
                memo[n] = Math.min(recursive(n / 2), recursive(n - 1)) + 1;
            } else {
                memo[n] = recursive(n - 1) + 1;
            }
            return memo[n];
        }
    }
}
