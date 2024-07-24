import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    static int N;
    static LinkedList<Integer>[] graph;
    static boolean[] visited;
    static int[] parents;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new LinkedList[N + 1];
        visited = new boolean[N + 1];
        parents = new int[N + 1];


        for (int i = 1; i <= N; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int i = 1; i <= N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
    }

    static void dfs(int num) {
        visited[num] = true;
        for (int next : graph[num]) {
            if (!visited[next]) {
                parents[next] = num;
                dfs(next);
            }
        }
    }
}
