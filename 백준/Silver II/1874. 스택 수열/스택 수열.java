import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        solve(a);
    }

    static void solve(int[] a) {
        Stack<Integer> s = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int m = 0;

        for (int i : a) {
            if (i > m) {
                while (i > m) {
                    s.push(++m);
                    sb.append("+\n");
                }
                s.pop();
                sb.append("-\n");
            } else {
                if (s.peek() != i) {
                    System.out.println("NO");
                    return;
                }
                s.pop();
                sb.append("-\n");
            }
        }
        System.out.println(sb);
    }
}
