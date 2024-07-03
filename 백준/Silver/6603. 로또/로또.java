import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int k;
    static int[] arr;
    static int[] result;
    static boolean[] visited;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            k = sc.nextInt();
            if (k == 0) {
                break;
            }

            arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }

            visited = new boolean[k];
            result = new int[6];

            back(0, 0);
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static void back(int s, int d) {
        if (d == 6) {
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = s; i < k; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[d] = arr[i];
                back(i, d + 1);
                visited[i] = false;
            }
        }
    }
}
