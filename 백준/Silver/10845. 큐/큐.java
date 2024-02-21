import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int[] queue = new int[n];
        int begin = 0;
        int end = 0;

        while (n-- > 0) {
            String s = sc.next();
            switch (s) {
                case "push" -> {
                    int n1 = Integer.parseInt(sc.next());
                    queue[end++] = n1;
                }
                case "pop" -> {
                    if (begin == end) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue[begin] + "\n");
                        queue[begin++] = 0;
                    }
                }
                case "size" -> bw.write(end - begin + "\n");
                case "empty" -> {
                    if (begin == end) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                }
                case "front" -> {
                    if (begin == end) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue[begin] + "\n");
                    }
                }
                case "back" -> {
                    if (begin == end) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue[end - 1] + "\n");
                    }
                }
            }
        }
        bw.flush();
    }
}
