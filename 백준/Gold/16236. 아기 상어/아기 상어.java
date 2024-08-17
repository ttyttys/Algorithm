import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, eat, move;
    static int size = 2;
    static int[][] arr;
    static boolean[][] visited;
    static int[] now;

    static int[] dy = {1, 0, 0, -1};
    static int[] dx = {0, -1, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 9) {
                    now = new int[]{i, j};
                    arr[i][j] = 0;
                }
            }
        }
        bfs();
        System.out.println(move);
    }

    static void bfs() {
        while (true) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) ->
                        o1[2] != o2[2] ? Integer.compare(o1[2], o2[2]) : (o1[0] != o2[0] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
                );
            visited = new boolean[N][N];
            pq.add(new int[]{now[0], now[1], 0});
            visited[now[0]][now[1]] = true;
            boolean ck = false;

            while (!pq.isEmpty()) {
                now = pq.poll();

                if (arr[now[0]][now[1]] != 0 && arr[now[0]][now[1]] < size) {
                    arr[now[0]][now[1]] = 0;
                    eat++;
                    move += now[2];
                    ck = true;
                    break;
                }

                for (int i = 0; i < 4; i++) {
                    int ny = now[0] + dy[i];
                    int nx = now[1] + dx[i];

                    if (nx < 0 || ny < 0 || nx >= N || ny >= N || visited[ny][nx] || arr[ny][nx] > size) continue;
                    pq.add(new int[]{ny, nx, now[2] + 1});
                    visited[ny][nx] = true;
                }
            }
            if (!ck) {
                return;
            }

            if (eat == size) {
                size++;
                eat = 0;
            }
        }
    }
}
