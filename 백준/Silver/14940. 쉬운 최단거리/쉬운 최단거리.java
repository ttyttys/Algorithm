import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    static int N, M, sy, sx;
    static int[][] map;
    static int[][] visited;
    static String[] ss;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static StringBuilder sb = new StringBuilder();

    static class Pair {
        int y, x;

        Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ss = in.readLine().split(" ");
        N = Integer.parseInt(ss[0]);
        M = Integer.parseInt(ss[1]);
        map = new int[N][M];
        visited = new int[N][M];
        for (int i = 0; i < N; i++) {
            ss = in.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(ss[j]);

                if (map[i][j] == 2) {
                    sy = i;
                    sx = j;
                }
            }
        }

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(sy, sx));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int y = p.y;
            int x = p.x;

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || nx < 0 || ny >= N || nx >= M)
                    continue;
                if (map[ny][nx] == 2 || map[ny][nx] == 0) {
                    continue;
                }

                if (visited[ny][nx] == 0 || visited[ny][nx] > visited[y][x] + 1) {
                    visited[ny][nx] = visited[y][x] + 1;
                    q.add(new Pair(ny, nx));
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                if (map[i][j] != 2 && map[i][j] != 0 && visited[i][j] == 0) {
                    visited[i][j] = -1;
                }

                sb.append(visited[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }
}
