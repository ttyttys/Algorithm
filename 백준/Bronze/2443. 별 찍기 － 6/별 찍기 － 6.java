import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int N = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= N; j++) {
                if (j < i){
                    System.out.print(" ");
                }
                else {
                    if (j <= (N + 1) - i)
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}