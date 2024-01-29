import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = minNum(N);
        System.out.println(result);
    }

    public static int minNum(int N){
        int n = Math.max(N / 3, N / 5);
        int min = -1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (N == 3 * i + 5 * j) {
                    return i + j;
                }
            }
        }
        return min;
    }

}