import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] arr1 = new int[N][M];

        for (int a = 0; a < 2; a++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr1[i][j] += scanner.nextInt();
                }
                scanner.nextLine();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr1[i][j]);
                if (j < M - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
