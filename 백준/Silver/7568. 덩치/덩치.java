import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] w = new int[n];
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        solve(w, h);
    }

    static void solve(int[] w, int[] h) {
        int n = w.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (w[i] < w[j] && h[i] < h[j]) {
                    arr[i] += 1;
                } else if (w[i] > w[j] && h[i] > h[j]) {
                    arr[j] += 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
