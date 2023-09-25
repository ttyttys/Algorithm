import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();

        int [] cnt = new int[10];
        int res = a * b * c;
        String s = Integer.toString(res);

        for (int i = 0; i < s.length(); i++)
            cnt[s.charAt(i) - '0']++;

        for (int i = 0; i < cnt.length; i++)
            System.out.println(cnt[i]);

    }
}