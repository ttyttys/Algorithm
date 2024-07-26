import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int MAX_IVEN_SiZE = 64000000;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] arr = new int[N * M];

        int max = -1;
        int min = 257;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i * M + j] = Integer.parseInt(st.nextToken());

                max = Math.max(max, arr[i * M + j]);
                min = Math.min(min, arr[i * M + j]);
            }
        }

        int maxHeight =  -1;
        int minTime = 64000001 * 2;

        for (int i = max; i >= min; i--) {
            boolean isFail = false;
            int time = 0;
            int invenCnt = B;

            for (int j = 0; j < N * M; j++) {

                if (i < arr[j]) {
                    int add = arr[j] - i;

                    if (invenCnt > MAX_IVEN_SiZE) {
                        isFail = true;
                        break;
                    }

                    invenCnt += add;
                    time += add * 2;
                }

            }

            for (int j = 0; j < N * M; j++) {
                
                if (i > arr[j]) {
                    int sub = i - arr[j];

                    if (sub > invenCnt) {
                        isFail = true;
                        break;
                    }

                    invenCnt -= sub;
                    time += sub;
                }
            }

            if (!isFail && time < minTime) {
                maxHeight = i;
                minTime = time;
            }
        }

        System.out.println(minTime + " " + maxHeight);
    }
}
