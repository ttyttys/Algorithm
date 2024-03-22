import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }

            if (stack.isEmpty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
            stack.clear();
        }
        bw.flush();
    }
}
