import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int[][] board;
    static int[] students;
    static ArrayList<Integer>[] friends;
    static PriorityQueue<Point> pq = new PriorityQueue<>();
    static int N;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static class Point implements Comparable<Point> {
        int x, y, nearCont, likeCount;

        Point(int y, int x, int nearCont, int likeCount) {
            this.y = y;
            this.x = x;
            this.nearCont = nearCont;
            this.likeCount = likeCount;
        }

        @Override
        public int compareTo(Point o) {
            if (likeCount != o.likeCount) return -(likeCount - o.likeCount);
            if (nearCont != o.nearCont) return -(nearCont-o.nearCont);
            if (x != o.x) return x - o.x;
            return y - o.y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N + 1][N + 1];
        students = new int[N * N + 1];
        friends = new ArrayList[N * N + 1];

        for (int i = 1; i <= N * N; i++) {
            friends[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N * N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            students[i] = student;

            for (int j = 0; j < 4; j++) {
                friends[student].add(Integer.parseInt(st.nextToken()));
            }
        }

        for (int i = 1; i <= N * N; i++) {
            solve(students[i]);
            pq.clear();
        }

        int result = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                result += getScore(i, j);
            }
        }
        System.out.println(result);
    }

    static int getScore(int y, int x) {
        int student = board[y][x];
        int nx, ny, likeCount = 0;
        for (Integer now : friends[student]) {
            for (int k = 0; k < 4; k++) {
                ny = y + dy[k];
                nx = x + dx[k];
                if (nx < 1 || ny < 1 || nx > N || ny > N) continue;
                if (board[ny][nx] == now) {
                    likeCount++;
                }
            }
        }
        return calculate(likeCount);
    }

    static int calculate(int likeCount) {
        return switch (likeCount) {
            case 0 -> 0;
            case 1 -> 1;
            case 2 -> 10;
            case 3 -> 100;
            default -> 1000;
        };
    }

    static void solve(int student) {
        int nx, ny, nearCont, likeCount;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                nearCont = 0;
                likeCount = 0;
                if (board[i][j] != 0) continue;
                for (int k = 0; k < 4; k++) {
                    ny = i + dy[k];
                    nx = j + dx[k];

                    if (nx < 1 || ny < 1 || nx > N || ny > N) continue;
                    for (Integer now : friends[student]) {
                        if (board[ny][nx] == now) {
                            likeCount++;
                        }
                    }
                    if (board[ny][nx] == 0) nearCont++;
                }
                pq.add(new Point(i, j, nearCont, likeCount));
            }
        }
        Point p = pq.poll();
        board[p.y][p.x] = student;
    }
}
