import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int num = (int) Math.round(n * 0.15);

        for (int i = 0; i < num; i++) {
            arr[i] = 0;
            arr[(arr.length - 1) - i] = 0;
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        int result = (int) Math.round(sum * 1.0 / (arr.length - num * 2));
        System.out.println(result);
    }
}