import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (s1, s2) -> {
            int age1 = Integer.parseInt(s1.split(" ")[0]);
            int age2 = Integer.parseInt(s2.split(" ")[0]);
            return age1 - age2;
        });

        for (String s : arr) {
            bw.write(s.split(" ")[0] + " " + s.split(" ")[1] + "\n");
        }
        bw.flush();
    }
}
