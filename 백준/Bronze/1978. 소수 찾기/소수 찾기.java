import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (isPrime(arr[i])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean isPrime(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
