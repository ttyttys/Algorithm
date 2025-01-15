import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[][] arr = new boolean[C + 1][R + 1];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            if (sx < 0 || sx > R || sy < 0 || sy > C) continue;
            if (ex < 0 || ex > R || ey < 0 || ey > C) continue;

            if (sx > ex) {
                int tmp = sx;
                sx = ex;
                ex = tmp;
            }
            if (sy > ey) {
                int tmp = sy;
                sy = ey;
                ey = tmp;
            }

            for (int j = sy; j <= ey; j++) {
                for (int k = sx; k <= ex; k++) {
                    if (!arr[j][k]) {
                        cnt++;
                        arr[j][k] = true;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}
