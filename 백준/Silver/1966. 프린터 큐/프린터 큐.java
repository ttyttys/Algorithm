import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int cnt = 0;
            int max = 0;

            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                queue.offer(k);
                max = Math.max(k, max); // 가장 큰 중요도를 업데이트
            }

            while (true) {
                int polledValue = queue.poll();
                if (polledValue == max) { // 가장 큰 중요도의 문서를 찾으면
                    cnt++;
                    if (m == 0) { // 찾고자 하는 문서일 경우
                        bw.write(cnt + "\n");
                        break;
                    }
                    m--; // 찾고자 하는 문서가 아니라면 다음으로 넘어감
                    max = findMax(queue); // 가장 큰 중요도 업데이트
                } else {
                    queue.offer(polledValue); // 가장 큰 중요도의 문서가 아니라면 다시 큐에 넣음
                    if (m == 0) { // 찾고자 하는 문서의 인덱스를 조정
                        m = queue.size() - 1;
                    } else {
                        m--;
                    }
                }
            }
        }
        bw.flush();
    }

    // 큐에서 가장 큰 중요도를 찾는 메서드
    static int findMax(Queue<Integer> queue) {
        int max = 0;
        for (int num : queue) {
            max = Math.max(num, max);
        }
        return max;
    }
}