import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N, H;
    static int[][][] box;
    static int count = 0;

    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static Queue<Node> q = new LinkedList<>();

    static class Node {
        int x, y, z, count;
        Node(int x, int y, int z, int count) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

        solve();
    }

    static void bfs() {
        while (!q.isEmpty()) {
            Node now = q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = now.x + dx[i]; // H
                int ny = now.y + dy[i]; // N
                int nz = now.z + dz[i]; // M

                if (nx < 0 || nx >= H || ny < 0 || ny >= N || nz < 0 || nz >= M) continue;
                if (box[nx][ny][nz] == 1) continue;
                if (box[nx][ny][nz] == -1) continue;
                box[nx][ny][nz] = 1;
                q.add(new Node(nx, ny, nz, now.count + 1));
                count = now.count + 1;
            }
        }
    }

    static void solve() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 1) {
                        q.offer(new Node(i, j, k, 0));
                    }
                }
            }
        }

        if (q.size() == M * N * H) {
            System.out.println(0);
            return;
        }

        bfs();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
