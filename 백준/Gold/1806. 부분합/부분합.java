import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        while (true) {
            if (sum >= S) {
                sum -= arr[start];
                result = Math.min(result, end - start);
                start++;
            } else if (end == N) {
                break;
            } else {
                sum += arr[end];
                end++;
            }
        }

        if (result == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}
