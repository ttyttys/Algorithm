import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1];
        arr[0] = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                stack.push(arr[j]);
            }

            if (!stack.isEmpty()) {
                for (int j = a; j <= b; j++) {
                    arr[j] = stack.pop();
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
