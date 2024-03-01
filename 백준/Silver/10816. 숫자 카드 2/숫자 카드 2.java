import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(s1[i])) {
                hm.put(s1[i], hm.get(s1[i]) + 1);
            } else {
                hm.put(s1[i], 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            if (hm.containsKey(s2[i])) {
                bw.write(String.valueOf(hm.get(s2[i])));
            } else {
                bw.write("0");
            }

            if (i < m - 1) {
                bw.write(" ");
            }
        }
        bw.flush();
    }
}
