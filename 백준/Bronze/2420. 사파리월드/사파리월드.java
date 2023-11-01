import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();

        long c = a - b;
        System.out.println(Math.abs(c));
    }
}