import java.io.*;
import java.util.TreeSet;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");

        int m = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");

        findNum(a, b);
    }
    static void findNum(String[] a, String[] b) throws IOException {
        TreeSet<String> ts = new TreeSet<>();
        for (String i : a) {
            ts.add(i);
        }

        for (String i : b) {
            if (ts.contains(i)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
    }
}
