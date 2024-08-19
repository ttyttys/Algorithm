import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int T, N , cnt;
    static int[] list;
    static boolean[] visited, done;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            list = new int[N + 1];
            visited = new boolean[N + 1];
            done = new boolean[N + 1];
            cnt = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= N; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= N; i++) {
                dfs(i);
            }

            System.out.println(N - cnt);
        }
    }

    static void dfs(int s) {
        if (visited[s]) return;
        visited[s] = true;
        int next = list[s];

        if (!visited[next]) {
            dfs(next);
        } else {
            if (!done[next]) {
                cnt++;
                for (int i = next; i != s; i = list[i]) {
                    cnt++;
                }
            }
        }
        done[s] = true;
    }
}
