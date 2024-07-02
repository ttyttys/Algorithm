import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int money = 1000 - n;
        int cnt = 0;
        int[] change = {500, 100, 50, 10, 5, 1};

        for (int i : change) {
            if (money >= i) {
                cnt += money / i;
                money %= i;
            }
        }

        System.out.println(cnt);
    }
}
