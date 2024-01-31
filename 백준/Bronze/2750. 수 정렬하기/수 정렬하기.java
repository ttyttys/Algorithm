import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        sortArr(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    int temp = arr[i];
                    min = arr[j];
                    arr[j] = temp;
                    arr[i] = min;
                }
            }
        }
    }
}
