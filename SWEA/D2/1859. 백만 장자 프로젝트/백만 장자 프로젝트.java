import java.io.*;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            long sum = 0;
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int p = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                if (p < arr[j]) {
                    p = arr[j];
                }
                if (p > arr[j]) {
                    sum += p - arr[j];
                }
            }
            bw.write("#" + (i + 1) + " " + sum + "\n");
        }
        bw.flush();
    }
}
