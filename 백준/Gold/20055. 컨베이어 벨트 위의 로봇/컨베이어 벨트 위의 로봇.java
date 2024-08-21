import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int cnt = 0;
    static LinkedList<Belt> conveyor = new LinkedList<>();

    static class Belt {
        boolean robot;
        int durability;

        public Belt(boolean robot, int durability) {
            this.robot = robot;
            this.durability = durability;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N * 2; i++) {
            conveyor.add(new Belt(false, Integer.parseInt(st.nextToken())));
        }
        solve();
        System.out.println(cnt);
    }

    static void solve() {
        while (true) {
            cnt++;

            conveyor.addFirst(conveyor.pollLast());
            if (conveyor.get(N -1).robot) conveyor.get(N -1).robot = false;

            for (int i = N - 1; i > 0; i--) {
                if (!conveyor.get(i).robot && conveyor.get(i - 1).robot) {
                    if (conveyor.get(i).durability > 0) {
                        conveyor.get(i - 1).robot = false;
                        conveyor.get(i).robot = true;
                        conveyor.get(i).durability--;
                    }
                }
                if (i == N - 1) conveyor.get(i).robot = false;
            }

            if (conveyor.getFirst().durability > 0) {
                conveyor.getFirst().robot = true;
                conveyor.getFirst().durability--;
            }

            if (countZero() >= K) {
                return;
            }
        }
    }

    static int countZero() {
        int zeroCnt = 0;
        for (Belt point : conveyor) {
            if (point.durability == 0) {
                zeroCnt++;
            }
        }
        return zeroCnt;
    }
}
