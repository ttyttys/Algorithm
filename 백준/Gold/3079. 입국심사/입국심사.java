import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static long m, max;
    static int[] arr;
    static long result = Long.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextLong();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        Arrays.sort(arr);
        solve();
        System.out.println(result);
    }

    static void solve() {
        long left = 0;
        long right = max * m;

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i : arr) {
                long cnt = mid / i;
                if (sum >= m) {
                    break;
                }
                sum += cnt;
            }

            if (sum >= m) {
                right = mid - 1;
                result = Math.min(result, mid);
            } else {
                left = mid + 1;
            }
        }
    }
}
