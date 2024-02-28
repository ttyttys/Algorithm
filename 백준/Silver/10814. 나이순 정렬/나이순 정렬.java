import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine() + " " + i;
        }

        Arrays.sort(arr, (s1, s2) -> {
            String[] split1 = s1.split(" ");
            String[] split2 = s2.split(" ");
            int age1 = Integer.parseInt(split1[0]);
            int age2 = Integer.parseInt(split2[0]);
            if (age1 != age2) {
                return Integer.compare(age1, age2);
            } else {
                return Integer.compare(Integer.parseInt(split1[2]), Integer.parseInt(split2[2]));
            }
        });

        for (String s : arr) {
            bw.write(s.split(" ")[0] + " " + s.split(" ")[1] + "\n");
        }
        bw.flush();
    }
}
