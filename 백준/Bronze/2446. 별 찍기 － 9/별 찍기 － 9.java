import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i - 1; j++) {
                sb.append(" ");
            }
            for (int j = i; j <= 2 * N - i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                sb.append(" ");
            }
            for (int j = i; j <= 2 * N - i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
