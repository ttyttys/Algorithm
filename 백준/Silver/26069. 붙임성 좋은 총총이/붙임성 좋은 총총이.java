import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();
            if (!map.containsKey(name1)) {
                map.put(name1, 0);
            }
            if (!map.containsKey(name2)) {
                map.put(name2, 0);
            }
            String c = "ChongChong";
            if (name1.equals(c) || name2.equals(c)) {
                map.put(name1, 1);
                map.put(name2, 1);
            } else {
                if (map.get(name1) == 1 || map.get(name2) == 1) {
                    map.put(name1, 1);
                    map.put(name2, 1);
                }
            }
        }

        int result = 0;
        for (Integer value : map.values()) {
            result += value;
        }
        System.out.println(result);
    }
}
