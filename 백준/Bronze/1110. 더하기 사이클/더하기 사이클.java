import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int right = N % 10;
        int left = N / 10;
        int sum = left + right;
        if (sum > 9) {
            sum = sum % 10;
        }
        int num = right * 10 + sum;
        int cnt = 1;
        while (num != N) {
            right = num % 10;
            left = num / 10;
            sum = left + right;
            if (sum > 9) {
                sum = sum % 10;
            }
            num = right * 10 + sum;
            cnt++;
        }
        System.out.println(cnt);
    }
}
