import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = biDnc(n, k);
        System.out.println(result);
    }

    static int biDnc(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        } else {
            return biDnc(n - 1, k) + biDnc(n - 1, k - 1);
        }
    }
}
