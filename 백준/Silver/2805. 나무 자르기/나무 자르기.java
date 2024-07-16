import java.util.Scanner;

public class Main {
    static long MAX = 0;
    static long[] arr;

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new long[N];
        long max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        solve(0, max, M);
        System.out.println(MAX);
    }

    static void solve(long min, long max, long M) {
        long mid = (min + max) / 2;
        if (min > max) {
            return;
        }

        if (getResult(mid) >= M) {
            if (MAX < mid) {
                MAX = mid;
            }
            solve(mid + 1, max, M);
        } else solve(min, mid - 1, M);
    }

    private static long getResult(long mid) {
        long result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                result += arr[i] - mid;
            }
        }
        return result;
    }
}
