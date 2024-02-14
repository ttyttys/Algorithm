import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        while (n-- > 0) {
            int rCnt = 0;
            int lCnt = 0;
            String vps = sc.next();
            for (int i = 0; i < vps.length(); i++) {
                char c = vps.charAt(i);
                if (c == '(') {
                    rCnt++;
                } else if (c == ')') {
                    lCnt++;
                }
                if (rCnt < lCnt) {
                    break;
                }
            }
            if (rCnt == lCnt) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
