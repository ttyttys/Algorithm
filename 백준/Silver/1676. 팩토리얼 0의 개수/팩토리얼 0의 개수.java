import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        findZero(N);
    }

    static void findZero(int N) {
        int cnt = 0;

        while (N >= 5) {
            cnt = cnt + N / 5;
            N /= 5;
        }
        System.out.println(cnt);
    }
}