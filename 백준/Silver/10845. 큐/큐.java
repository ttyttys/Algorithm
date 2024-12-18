import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int begin = 0;
        int end = 0;

        while (n-- > 0) {
            String cmd = sc.next();

            if (cmd.equals("push")) {
                int num = sc.nextInt();
                arr[end++] = num;
            } else if (cmd.equals("pop")) {
                if (begin == end) {
                    sb.append("-1\n");
                } else {
                    sb.append(arr[begin++]).append("\n");
                }
            } else if (cmd.equals("size")) {
                sb.append(end - begin).append("\n");
            } else if (cmd.equals("empty")) {
                if (begin == end) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (cmd.equals("front")) {
                if (begin == end) {
                    sb.append("-1\n");
                } else {
                    sb.append(arr[begin]).append("\n");
                }
            } else if (cmd.equals("back")) {
                if (begin == end) {
                    sb.append("-1\n");
                } else {
                    sb.append(arr[end - 1]).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
