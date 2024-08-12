import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, K, time, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N >= K) {
            System.out.println(N - K);
            System.out.println(1);
            return;
        }
        bfs();
        System.out.println(time + "\n" + cnt);
    }

    static void bfs() {
        int[] visited = new int[100001];
        Queue<Point> q = new LinkedList<>();
        visited[N] = 1;
        q.add(new Point(N, 0));

        while (!q.isEmpty()) {
            Point p = q.poll();
            if (p.x == K) {
                if (cnt == 0) time = p.y;
                if (time == p.y) cnt++;
                continue;
            }
            int[] arr = {p.x - 1, p.x + 1, p.x * 2};
            for (int i = 0; i < arr.length; i++) {
                int next = arr[i];
                if (next < 0 || next > 100000) continue;
                if (visited[next] == 0 || visited[next] == p.y + 1) {
                    visited[next] = p.y + 1;
                    q.add(new Point(next, p.y + 1));
                }
            }
        }
    }
}
