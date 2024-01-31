import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        average(arr);
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void average(int[] arr) {
        int n = findMax(arr);
        double sum = 0;
        for (int j : arr) {
            sum += (double) j / n * 100;
        }
        System.out.println(sum / arr.length);;
    }
}
