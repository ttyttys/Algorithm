import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, L, R;
    static int[][] country;
    static boolean[][] visited;
    static ArrayList<Point> list;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        country = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                country[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(move());
    }

    static int move() {
        int result = 0;
        while (true) {
            boolean isMove = false;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        int sum = bfs(i, j);
                        if (list.size() > 1) {
                            change(sum);
                            isMove = true;
                        }
                    }
                }
            }
            if (!isMove) {
                return result;
            }
            result++;
        }
    }

    static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        list = new ArrayList<>();

        q.add(new Point(x, y));
        list.add(new Point(x, y));
        visited[x][y] = true;

        int sum = country[x][y];
        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny]) {
                    int temp = Math.abs(country[p.x][p.y] - country[nx][ny]);
                    if (L <= temp && temp <= R) {
                        visited[nx][ny] = true;
                        q.add(new Point(nx, ny));
                        list.add(new Point(nx, ny));
                        sum += country[nx][ny];
                    }
                }
            }
        }
        return sum;
    }

    static void change(int sum) {
        int avg = sum / list.size();
        for (Point point : list) {
            country[point.x][point.y] = avg;
        }
    }
}
