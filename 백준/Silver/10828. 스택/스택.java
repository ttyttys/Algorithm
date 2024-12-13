import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] stack = new int[n];
        int size = 0;
        while (n-- > 0) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int num = sc.nextInt();
                stack[size++] = num;
            } else if (cmd.equals("pop")) {
                if (size == 0) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack[size - 1]).append("\n");
                    size--;
                }
            } else if (cmd.equals("size")) {
                sb.append(size).append("\n");
            } else if (cmd.equals("empty")) {
                if (size == 0) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (cmd.equals("top")) {
                if (size == 0) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack[size - 1]).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
