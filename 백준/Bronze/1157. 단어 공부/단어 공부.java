import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = s.toUpperCase();
        char[] c = s1.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < c.length; i++) {
            if (list.contains(c[i])) {
                continue;
            }
            list.add(c[i]);
        }

        int[] count = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (list.get(i) == c[j]) {
                    count[i]++;
                }
            }
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = list.get(i);
            } else if (max == count[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
