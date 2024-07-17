import java.util.Scanner;

public class Main {
    static int[][] arr;
    static Pair[] pairs;

    static class Pair {
        int start, end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N][N];
        pairs = new Pair[N * N];  // 최대 N * N개의 Pair가 있을 수 있습니다.

        int pairCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    pairs[pairCount++] = new Pair(i, j);
                }
            }
        }

        // 필요 없는 pairs 배열의 남은 공간을 null로 채워 초기화
        for (int i = pairCount; i < pairs.length; i++) {
            pairs[i] = null;
        }

        for (int i = 0; i < pairCount; i++) {
            if (pairs[i] != null) {
                solve(pairs[i].start, pairs[i].end, N);
            }
        }

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void solve(int start, int end, int N) {
        boolean[] visited = new boolean[N];
        dfs(start, end, visited);
    }

    static void dfs(int start, int current, boolean[] visited) {
        for (Pair pair : pairs) {
            if (pair != null && pair.start == current && !visited[pair.end]) {
                visited[pair.end] = true;
                arr[start][pair.end] = 1;
                dfs(start, pair.end, visited);
            }
        }
    }
}
