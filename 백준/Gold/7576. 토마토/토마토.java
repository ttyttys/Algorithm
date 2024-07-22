import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int M;
    static int N;
    static int[][] tomatoes;
    static int result = 0;

    static Queue<Pair> queue = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Pair {
        int x;
        int y;
        int count;

        Pair(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();
        tomatoes = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tomatoes[i][j] = sc.nextInt();
                if (tomatoes[i][j] == 1) {
                    queue.add(new Pair(i, j, 0));
                }
            }
        }

        solve();
    }

    static void bfs() {
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (tomatoes[nx][ny] == 1) continue;
                if (tomatoes[nx][ny] == -1) continue;
                tomatoes[nx][ny] = 1;
                queue.add(new Pair(nx, ny, p.count + 1));
                result = p.count + 1;
            }
        }
    }

    static void solve() {
        if (queue.size() == N * M) {
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
