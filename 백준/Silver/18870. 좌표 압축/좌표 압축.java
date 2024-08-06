import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[N];
        int[] sorted = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sorted[i] = arr[i];
        }

        Arrays.sort(sorted);

        int index = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], index++);
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(map.get(arr[i]) + " ");
        }
        bw.flush();
    }
}
