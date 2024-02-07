import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();

        int[] arr = new int[K];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        long max = maxLength(arr, N);
        resultLength(arr, max, N);
    }

    static long maxLength(int[] arr, int N) {
        long sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / N;
    }

    static void resultLength(int[] arr, long max, int N) {
        long min = 1;
        long count, mid;

        while (min <= max) {
            count = 0;
            mid = (min + max) / 2;
            for (int i : arr) {
                count += i / mid;
            }
            if (count < N) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(max);
    }

}
