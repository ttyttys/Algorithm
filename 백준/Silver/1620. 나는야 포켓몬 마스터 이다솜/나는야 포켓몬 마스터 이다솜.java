import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static HashMap<String, Integer> hm = new HashMap<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = br.readLine();
            hm.put(arr[i], i);
        }

        solve(m, arr);
    }

    public static void solve(int m, String[] arr) throws IOException {
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (hm.containsKey(s)) {
                bw.write(hm.get(s) + "\n");
            } else {
                bw.write(arr[Integer.parseInt(s)] + "\n");
            }
        }
        bw.flush();
    }
}
