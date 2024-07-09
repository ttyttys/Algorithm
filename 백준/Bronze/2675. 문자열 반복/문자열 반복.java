import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] ss = s.split(" ");
            int r = Integer.parseInt(ss[0]);
            for (int j = 0; j < ss[1].length(); j++) {
                for (int k = 0; k < r; k++) {
                    sb.append(ss[1].charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
