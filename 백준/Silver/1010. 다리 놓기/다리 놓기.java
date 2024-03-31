import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            bw.write(solve(n, m) + "\n");
        }
        bw.flush();
    }

    public static BigInteger solve(int n, int m) {
        BigInteger result = new BigInteger("1");

        for (int i = m; i > m - n; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        for (int i = n; i > 1; i--) {
            result = result.divide(BigInteger.valueOf(i));
        }

        return result;
    }
}
