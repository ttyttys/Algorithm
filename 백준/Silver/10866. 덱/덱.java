import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int n = sc.nextInt();

        while (n-- > 0) {
            String s = sc.next();
            switch (s) {
                case "push_front" -> {
                    int num = Integer.parseInt(sc.next());
                    deque.offerFirst(num);
                }
                case "push_back" -> {
                    int num = Integer.parseInt(sc.next());
                    deque.offerLast(num);
                }
                case "pop_front" -> {
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.pollFirst() + "\n");
                    }
                }
                case "pop_back" -> {
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.pollLast() + "\n");
                    }
                }
                case "size" -> {
                    bw.write(deque.size() + "\n");
                }
                case "empty" -> {
                    if (deque.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                }
                case "front" -> {
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekFirst() + "\n");
                    }
                }
                case "back" -> {
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekLast() + "\n");
                    }
                }
            }
        }
        bw.flush();
    }
}
