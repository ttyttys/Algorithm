import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (sum >= 100) {
                break;
            }
            sum += arr[i];
            cnt++;
        }

        int tmp = sum - arr[cnt - 1];
        if (Math.abs(100 - tmp) == Math.abs(100 - sum)) {
            System.out.println(sum);
        } else if (Math.abs(100 - tmp) < Math.abs(100 - sum)) {
            System.out.println(tmp);
        } else {
            System.out.println(sum);
        }
    }
}
