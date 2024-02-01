import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        findNum(N);
    }

    static void findNum(int N) {
        for (int i = 1; i < N; i++) {
            if (getSumOfDigit(i) + i == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    static int getSumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
