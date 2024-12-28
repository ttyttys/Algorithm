import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] tomatoes;
    static int result = 0;
    static Queue<Pair> q = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Pair {
        int x, y, count;

        Pair(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        tomatoes = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomatoes[i][j] = Integer.parseInt(st.nextToken());
                if (tomatoes[i][j] == 1) {
                    q.add(new Pair(i, j, 0));
                }
            }
        }
        solve();
    }

    public static void bfs() {
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (tomatoes[nx][ny] == 1) continue;
                if (tomatoes[nx][ny] == -1) continue;
                tomatoes[nx][ny] = 1;
                q.add(new Pair(nx, ny, p.count + 1));
                result = p.count + 1;
            }
        }

    }

    public static void solve() {
        if (q.size() == N * M) {
            System.out.println(0);
            return;
        }

        bfs();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomatoes[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(result);
    }
}
