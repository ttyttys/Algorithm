import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList<String>[] q = new LinkedList[4];
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 4; i++) {
            q[i] = new LinkedList<>();
            fill(q[i]);
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            visited = new boolean[4];
            rotate(Integer.parseInt(arr[0]) - 1, Integer.parseInt(arr[1]));
        }

        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (q[i].get(0).equals("1")) {
                result += Math.pow(2, i);
            }
        }
        System.out.println(result);
    }

    private static void rotate(int idx, int dir) {

        if (idx < 0 || idx >= 4 || visited[idx]) {
            return;
        }

        visited[idx] = true;
        String right = q[idx].get(2);
        String left = q[idx].get(6);


        if (dir == 1) {
            q[idx].addFirst(q[idx].pollLast());
        } else {
            q[idx].addLast(q[idx].pollFirst());
        }

        if (idx != 3 && !right.equals(q[idx + 1].get(6))) {
            rotate(idx + 1, -dir);
        }
        if (idx != 0 && !left.equals(q[idx - 1].get(2))) {
            rotate(idx - 1, -dir);
        }
    }

    private static void fill(LinkedList<String> q) throws IOException {
        String s = br.readLine();

        for (int j = 0; j < s.length(); j++) {
            q.add(String.valueOf(s.charAt(j)));
        }
    }
}
