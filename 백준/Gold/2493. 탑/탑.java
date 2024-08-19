import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack<>();
        for (int i = 1; i <= N; i++) {
            int h = Integer.parseInt(st.nextToken());

            if (stack.isEmpty()) {
                sb.append("0 ");
                stack.push(new int[]{h, i});
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        sb.append("0 ");
                        stack.push(new int[]{h, i});
                        break;
                    }

                    if (h > stack.peek()[0]) {
                        stack.pop();
                    } else {
                        sb.append(stack.peek()[1]).append(" ");
                        stack.push(new int[]{h, i});
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
