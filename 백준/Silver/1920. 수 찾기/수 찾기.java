import java.io.*;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static TreeSet<String> ts = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");

        int m = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");

        findNum(a, b);
    }
    static void findNum(String[] a, String[] b) throws IOException {
        Collections.addAll(ts, a);

        for (String s : b) {
            if (ts.contains(s)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
    }
}
