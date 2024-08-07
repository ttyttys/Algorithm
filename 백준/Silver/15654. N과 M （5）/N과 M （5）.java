import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] arr, result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        result = new int[M];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int d) {
        if (d == M) {
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[d] = arr[i];
                dfs(d + 1);
                visited[i] = false;
            }
        }
    }
}
