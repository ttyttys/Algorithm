import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a0 = in.nextInt();
        int c = in.nextInt();
        int n0 = in.nextInt();
        int f = a1 * n0 + a0;
        int g = c * n0;

        if (f <= g && a1 <= c)
            System.out.println(1);
        else
            System.out.println(0);
    }
}