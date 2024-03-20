import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 1;
        int first = 2;
        int last = 7;
        while (true) {
            if (n >= first && n <= last) {
                break;
            }
            first += 6 * cnt;
            last += 6 * (cnt + 1);
            cnt++;
        }
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(cnt + 1);
        }
    }
}
