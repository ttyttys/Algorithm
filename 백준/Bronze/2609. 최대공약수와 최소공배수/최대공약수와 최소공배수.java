import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k;
        int j;

        if (n > m) {
            j = m;
            k = n % m;
            while (k != 0) {
                int temp = k;
                k = m % k;
                m = temp;
            }
            System.out.println(m);
            System.out.println(n * (j / m));
        } else {
            j = n;
            k = m % n;
            while (k != 0) {
                int temp = k;
                k = n % k;
                n = temp;
            }
            System.out.println(n);
            System.out.println(m * (j / n));
        }
    }
}
