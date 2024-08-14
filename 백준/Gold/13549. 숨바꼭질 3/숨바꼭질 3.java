import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int time = Integer.MAX_VALUE;
    static int max = 100000;
    static boolean[] visited = new boolean[max + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs();
        System.out.println(time);
    }

    static void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(N, 0));
        while (!q.isEmpty()) {
            Point p = q.poll();
            visited[p.x] = true;
            if (p.x == K) {
                time = Math.min(time, p.y);
            }

            if (p.x * 2 <= max && !visited[p.x * 2]) {
                q.add(new Point(p.x * 2, p.y));
            }
            if (p.x + 1 <= max && !visited[p.x + 1]) {
                q.add(new Point(p.x + 1, p.y + 1));
            }
            if (p.x - 1 >= 0 && !visited[p.x - 1]) {
                q.add(new Point(p.x - 1, p.y + 1));
            }
        }
    }
}
