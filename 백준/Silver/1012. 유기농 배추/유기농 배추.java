import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dy = {0, 0, -1, 1};
    static int[] dx = {-1, 1, 0, 0};
    static Queue<Pair> q = new LinkedList<>();

    static class Pair {
        int x, y;
        Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            arr = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }

            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] == 1 && !visited[i][j]) {
                        cnt++;
                        bfs(i, j);
                    }
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
    }

    static void bfs(int y, int x) {
        q.add(new Pair(y, x));
        visited[y][x] = true;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int i = 0; i < 4; i++) {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];

                if (ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
                if (arr[ny][nx] != 1 || visited[ny][nx]) continue;
                q.add(new Pair(ny, nx));
                visited[ny][nx] = true;
            }
        }
    }
}
