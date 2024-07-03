import java.util.Scanner;

public class Main {

    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];
        visited = new boolean[n + 1];

        dfs(n, m, 0);
        System.out.println(sb);
    }

    private static void dfs(int n, int m, int d) {
        if (d == m) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[d] = i;
                dfs(n, m, d + 1);
                visited[i] = false;
            }
        }
        return;
    }
}
