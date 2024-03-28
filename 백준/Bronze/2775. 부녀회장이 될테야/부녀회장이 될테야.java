import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(solve(k, n) + "\n");
        }
        bw.flush();
    }

    public static int solve(int k, int n) {
        int[][] arr = new int[k][n];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    arr[i][j] = j + 1;
                } else {
                    for (int j1 = 0; j1 <= j; j1++) {
                        arr[i][j] += arr[i - 1][j1];
                    }
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[k - 1][i];
        }

        return sum;
    }
}