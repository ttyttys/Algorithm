import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 2000;

        for (int i = 0; i < 3; i++) {
            int m = sc.nextInt();
            if (m <= min) {
                min = m;
            }
        }
        sum += min;

        for (int i = 0; i < 2; i++) {
            int n = sc.nextInt();
            if (n < min) {
                min = n;
            }
        }
        sum += min;

        System.out.println(sum - 50);
    }
}
