import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] km = new int[n - 1];
        int[] gas = new int[n];

        for (int i = 0; i < n - 1; i++) {
            km[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }

        long min = gas[0];
        long result = km[0] * min;
        for (int i = 1; i < n - 1; i++) {
            if (min > gas[i]) {
                min = gas[i];
            }
            result += min * km[i];
        }

        System.out.println(result);
    }
}
