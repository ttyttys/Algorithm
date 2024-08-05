import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];

        dfs(1, 0);
        System.out.println(sb);
    }

    static void dfs(int s, int index) {
        if (index == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = s; i <= N; i++) {
            arr[index] = i;
            dfs(i, index + 1);
        }
    }
}
