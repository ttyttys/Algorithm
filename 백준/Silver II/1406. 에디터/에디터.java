import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();

        String n = br.readLine();
        for (int i = 0; i < n.length(); i++) {
            s1.push(n.charAt(i));
        }
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String a = br.readLine();
            switch (a.charAt(0)) {
                case 'L' -> {
                    if (!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }
                case 'D' -> {
                    if (!s2.isEmpty()) {
                        s1.push(s2.pop());
                    }
                }
                case 'B' -> {
                    if (!s1.isEmpty()) {
                        s1.pop();
                    }
                }
                case 'P' -> s1.push(a.charAt(2));
            }
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        while (!s2.isEmpty()) {
            sb.append(s2.pop());
        }
        System.out.println(sb);
    }
}
