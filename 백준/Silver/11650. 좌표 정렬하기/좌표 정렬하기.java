import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        sortArr(arr);

        for (String s : arr) {
            bw.write(s + "\n");
        }
        bw.flush();
    }

    static void sortArr(String[] arr) {
        Arrays.sort(arr, (s1, s2) -> {
            int[] xy1 = {Integer.parseInt(s1.split(" ")[0]), Integer.parseInt(s1.split(" ")[1])};
            int[] xy2 = {Integer.parseInt(s2.split(" ")[0]), Integer.parseInt(s2.split(" ")[1])};
            if (xy1[0] == xy2[0]) {
                return xy1[1] - xy2[1];
            }
            return xy1[0] - xy2[0];
        });
    }
}
